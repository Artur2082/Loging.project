package org.example.Loging.project;

import java.io.IOException;

public class MainLogger {
    public static void main(String[] args) throws IOException {
        FileLoggerConfiguration fileLoggerConfiguration = new FileLoggerConfiguration("C:\\Users\\Артур\\IdeaProjects\\Loging.project\\src\\main\\java\\Working_With_IO\\LogFile", LoggingLevel.DEBUG, 1000);
        FileLogger.setUpLogger(fileLoggerConfiguration);
        try {
            FileLogger.myLog(" First log sample \n");
            FileLogger.myLog(" Second log sample \n");
            FileLogger.myLog(" Third log sample \n");
            FileLogger.myLog(" Fourth log sample \n");
        } catch (FileMaxSizeReachedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
