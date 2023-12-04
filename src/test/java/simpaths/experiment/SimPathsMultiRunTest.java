package simpaths.experiment;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SimPathsMultiRunTest {

    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @BeforeAll
    public static void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @BeforeEach
    public void resetStreams() {
        outContent.reset();
        errContent.reset();
    }

    @Test
    public void testSimPathsMultiRunHelpOption() {
        String[] args = {"-h"};
        SimPathsMultiRun.main(args);

        String expectedHelpText = "SimPathsMultiRun can run multiple sequential runs, resetting the population to the start year and iterating from the start seed. It takes the following options:";

        assertTrue(outContent.toString().contains(expectedHelpText));
        assertEquals("", errContent.toString().trim());
    }

    // Add more test methods for other scenarios as needed
}
