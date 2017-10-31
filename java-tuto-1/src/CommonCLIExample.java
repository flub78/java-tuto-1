/**
 * Display command line parameters
 * 
 * usage from command line:

	$> java -jar target/my-utility.jar -i asd                                                                                       
	Missing required option: o

	usage: utility-name
 		-i,--input <arg>    input file path
 		-o,--output <arg>   output file
 *
 */

import org.apache.commons.cli.*;

public class CommonCLIExample {

    public static void main(String[] args) throws Exception {

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

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("utility-name", options);

            System.exit(1);
            return;
        }

        String inputFilePath = cmd.getOptionValue("input");
        String outputFilePath = cmd.getOptionValue("output");

        System.out.println(inputFilePath);
        System.out.println(outputFilePath);

    }

}
