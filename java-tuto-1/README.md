# java-tuto-1

This is a collection of java snipetts, small programs, examples used to learn the java language.

You will find:
* several main application
* using external classes
* with unit tests for the classes
* with javadoc

## Examples for
* console IOs
* loops
* arrays
* access to the file system, list directory
* simple classes and objects (no inheritance)
* parsing of the command line arguments
* read and write text files
* Database access

## Things todo

* Access to properties
* traces and logger 

## Running from Eclipse.

It is an Eclipse project, everything like UML generation, execution and debug, javadoc, unit tests and coverage should run from Eclipse.

## Running from command line

* Open a Windows terminal
* go to the bin directory of the project
* java -classpath . hello_world
* java -classpath . Prompt
* java -classpath . 
* java -cp ".;../jars/*" CommonCLIExample --input toto.txt -o toto.out
* java -cp ".;../jars/*" JFrameExample

or any other class in the directory.

## dependencies on external module
### Adding a jar to the project

1. download the jar and put it on the local filesystem
1. In the project contextual menu, select build path -> select external archives

### Dependencies

At some point the depencies management will have to be refactor to allow automatic download of the
required packages.

## External modules.
* commons-cli-1.3.1
* mysql-connector-java-5.1.44
* apache-log4j-2.9.1

## Special issue with log4J

with the default distribution: 
org.apache.logging.slf4j.SLF4JLoggerContext cannot be cast to org.apache.logging.log4j.core.LoggerContext

deleting log4jslf4j* solves the problem.

Do not forget to add the log4j.xml as the 
run configuration -> classpath -> user entries -> advanced -> add directories


## Database access

Download the connector:

https://dev.mysql.com/downloads/file/?id=472651



