package com.kodilla.patterns.singleton;

public class SettingsFileEngine {
    private static SettingsFileEngine settingsFileEngineInstance = null;
    private String fileName = "";

    private SettingsFileEngine() {
    }

    public String getFileName() {
        return fileName;
    }

    public static SettingsFileEngine getInstance() {
        if(settingsFileEngineInstance == null) {
            synchronized (SettingsFileEngine.class) {
                if(settingsFileEngineInstance == null) {
                    settingsFileEngineInstance = new SettingsFileEngine();
                }
            }
        }
        return settingsFileEngineInstance;
    }

    public void open(final String fileName) {
        this.fileName = fileName;
        System.out.println("Opening the setting file");
    }

    public void close() {
        this.fileName = "";
        System.out.println("Closing the setting file");
    }

    public boolean loadSettings() {
        System.out.println("Loading settings from the file");
        return true;
    }

    public boolean saveSettings() {
        System.out.println("Saving settings to the file");
        return true;
    }
}