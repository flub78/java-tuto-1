/**
 * Unit test for org.apache.commons.cli
 * 
 * The objectives is not to test the features, but to make sure that
 * correct jars are available
 * 
 */

package my.library.test;

import org.apache.commons.cli.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CommonCLIExampleTest {

	@Test
	void testMain() {
        Options options = new Options();

        Option input = new Option("i", "input", true, "input file path");
        input.setRequired(true);
        options.addOption(input);

        Option output = new Option("o", "output", true, "output file");
        output.setRequired(true);
        options.addOption(output);

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd;

        String[] args = {"-i toto.in", "-o toto.out"};
        
        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("utility-name", options);

            System.exit(1);
            return;
        }

        String inputFilePath = cmd.getOptionValue("input").trim();
        String outputFilePath = cmd.getOptionValue("output").trim();

        System.out.println("\"" + inputFilePath + "\"");
        System.out.println("\"" + outputFilePath + "\"");

        String expected = "toto.in";
		assertTrue(inputFilePath.toString().equals(expected), expected);

        expected = "toto.out";
		assertTrue(outputFilePath.toString().equals(expected), expected);

	}

}
