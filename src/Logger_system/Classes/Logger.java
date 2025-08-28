package Logger_system.Classes;

import java.util.ArrayList;

public class Logger {
    private static Logger instance;
    private ArrayList<ArrayList<String>> logs = new ArrayList<>();
    private ArrayList<String> currentLog = new ArrayList<>();

    public static final String RESET = "\u001B[0m";

    public static final String WRITE = "\u001B[38;2;250;179;12m";
    public static final String PRINT = "\u001B[38;2;250;250;12m";
    public static final String LINE = "\u001B[38;2;250;80;12m";

    private ArrayList<String> containsName(String name) {
        for (ArrayList<String> log : logs) {
            if (log.getFirst().equals(name)) {
                return log;
            }
        }
        return null;
    }

    private Logger() {
        currentLog.add("Default");
        logs.add(currentLog);
        System.out.println(PRINT + "Current log: Default" + RESET);
        System.out.println();
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void write(String message) {
        currentLog.add(message);
        System.out.println(WRITE + "Logged message: " + message + RESET);
        System.out.println();
    }

    public void setFileName(String fileName) {
        if (containsName(fileName) != null) {
            currentLog = containsName(fileName);
        } else {
            currentLog = new ArrayList<>();
            currentLog.add(fileName);
            logs.add(currentLog);
        }

        System.out.println(PRINT + "Current log: " + fileName + RESET);
        System.out.println();
    }

    public void printLogs() {
        System.out.println(LINE + "-------------------" + RESET);
        for (ArrayList<String> log : logs) {
            System.out.println(WRITE + "Log: " + log.getFirst() + RESET);
            for (int i = 1; i < log.size(); i++) {
                System.out.println(WRITE + "  " + log.get(i) + RESET);
            }
            System.out.println(LINE + "-------------------" + RESET);
        }
        System.out.println();
    }
}
