package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger loggerInstance = null;
    private String lastLog = "";

    private Logger() {

    }

    public static Logger getLoggerInstance() {
        if(loggerInstance == null) {
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }

    public String getLastLog() {
        return lastLog;
    }

    public void log(String log) {
        this.lastLog = log;
        System.out.println("Log: [" + log + "]");
    }
}
