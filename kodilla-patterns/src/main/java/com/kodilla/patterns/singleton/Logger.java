package com.kodilla.patterns.singleton;

public class Logger {
    private String lastLog = "";

    public void log(String log) {
        this.lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}
