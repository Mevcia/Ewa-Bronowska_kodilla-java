package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeClass
    public static void log() {
        logger = new Logger();
        logger.log("User Mike, Thu, 2018, JUN 26th at 20:40:39");
    }

    @Test
    public void testGetLastLog() {
//        Given
//        When
        String lastLog = logger.getLastLog();
//        Then
        Assert.assertEquals("User Mike, Thu, 2018, JUN 26th at 20:40:39", lastLog);
    }
}
