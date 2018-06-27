package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void log() {
        Logger.getLoggerInstance().log("User Mike, Thu, 2018, JUN 26th at 20:40:39");
    }

    @Test
    public void testGetLastLog() {
//        Given
//        When
        String lastLog = Logger.getLoggerInstance().getLastLog();
//        Then
        Assert.assertEquals("User Mike, Thu, 2018, JUN 26th at 20:40:39", lastLog);
    }
}
