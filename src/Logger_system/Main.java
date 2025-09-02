package Logger_system;

import Logger_system.Classes.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.write("This is the first log message.");

        logger.setFileName("ErrorLog");
        logger.write("This is an error message.");

        logger.setFileName("DebugLog");
        logger.write("This is a debug message.");

        logger.printLogs();

        logger.setFileName("ErrorLog");
        logger.write("Another error occurred.");

        logger.setFileName("Default");
        logger.write("Back to the default log.");

        logger.printLogs();

        Logger logger2 = Logger.getInstance();

        logger2.printLogs();
    }
}
