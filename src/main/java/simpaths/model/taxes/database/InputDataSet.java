package simpaths.model.taxes.database;


import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.*;

/**
 * CLASS TO MANAGE STORAGE OF INPUT DATA
 */
public class InputDataSet {


    /**
     * ATTRIBUTES
     */
    private Set<Map> set = new HashSet<>();


    /**
     * CONSTRUCTORS
     */
    public InputDataSet(){}


    /**
     * WORKER METHODS
     */
    public void add(CloneHousehold household) {
        for (Map person : household.getMembers()) {
            set.add(person);
        }
    }
    public Set<Map> getSet() {return set;}
    public void read(String[] variables, String filePath) throws IOException {

        File file = new File(filePath);
        if (!file.exists())
            throw new RuntimeException("failed to find file: " + filePath);

        Reader reader = new FileReader(filePath);
        CSVFormat csvFormat = CSVFormat.TDF.builder().setHeader(variables).setSkipHeaderRecord(true).build();
        Iterable<CSVRecord> records = csvFormat.parse(reader);
        for (CSVRecord record : records) {
            Map values = new HashMap<>();
            for (String variable : variables) {
                values.put(variable, Double.parseDouble(record.get(variable)));
            }
            set.add(values);
        }
    }
    public void write(String[] variables, String directory, String fileName) throws IOException {

        File chk = new File(directory);
        if (!chk.exists()) chk.mkdir();
        String filePath = directory + File.separator + fileName;

        Writer writer = new FileWriter(filePath);
        CSVFormat csvFormat = CSVFormat.TDF.builder().setHeader(variables).build();
        CSVPrinter printer = new CSVPrinter(writer, csvFormat);
        for (Map obs : set) {
            List<String> record = new ArrayList<>();
            for (String variable : variables) {
                record.add(Double.toString((double)obs.get(variable)));
            }
            printer.printRecord(record);
        }
        writer.flush();
        writer.close();
    }
}
