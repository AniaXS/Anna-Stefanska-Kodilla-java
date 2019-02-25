package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLog() {
        //Given
        Logger.getInstance().log("18111.005.2213");
        Logger.getInstance().log("18199.420.7792");
        Logger.getInstance().log("18284.000.1169");
        Logger.getInstance().log("18284.495.6364");
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println(lastLog);
        //Then
        Assert.assertEquals("18284.495.6364", lastLog);
    }
}