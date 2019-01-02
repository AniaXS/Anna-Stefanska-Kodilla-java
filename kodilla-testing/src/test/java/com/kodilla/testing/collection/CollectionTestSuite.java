package com.kodilla.testing.collection;

import org.junit.*;
import java.util.*;

public class CollectionTestSuite {

    @Before
    public void before() {

        System.out.println("The test starts");
    }

    @After
    public void after() {

        System.out.println("The test was ended");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator x = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<Integer>();
        List<Integer> result = x.exterminate(emptyList);
        Assert.assertEquals(emptyList, result);
        System.out.println("Testing exterminate for empty list");
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator x = new OddNumbersExterminator();
        List<Integer> testedList = new ArrayList<Integer>();
        testedList.add(1);
        testedList.add(2);
        testedList.add(3);
        testedList.add(4);
        testedList.add(5);
        testedList.add(6);
        List<Integer> model = new ArrayList<Integer>();
        model.add(2);
        model.add(4);
        model.add(6);
        List<Integer> result = x.exterminate(testedList);
        Assert.assertEquals(model, result);
        System.out.println("Testing exterminate for normal list");
    }
}