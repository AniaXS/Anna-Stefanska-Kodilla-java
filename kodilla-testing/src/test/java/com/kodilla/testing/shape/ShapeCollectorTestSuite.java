package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector figures = new ShapeCollector();
        Circle circle = new Circle(2);
        Square square = new Square(4);
        Triangle triangle = new Triangle(4, 2);

        //When
        figures.addFigure(circle);
        figures.addFigure(square);
        figures.addFigure(triangle);

        //Then
        Assert.assertEquals("Circle: 12.57, Square: 16.0, Triangle: 4.0", figures.showFigures());
    }

    @Test
    public void tesRemoveFigureNotExisting() {
        //Given
        ShapeCollector figures = new ShapeCollector();
        Circle circle = new Circle(2);

        //When
        boolean result = figures.removeFigure(circle);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void tesRemoveFigure() {
        //Given
        ShapeCollector figures = new ShapeCollector();
        Circle circle = new Circle(2);
        figures.addFigure(circle);

        //When
        boolean result = figures.removeFigure(circle);

        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector figures = new ShapeCollector();
        Circle circle = new Circle(2);
        figures.addFigure(circle);

        //When
        String figure = figures.getFigure(0);

        //Then
        Assert.assertEquals("Circle: 12.57", figure);
    }

    @Test
    public void testGetField() {
        //Given
        Circle circle = new Circle(2);
        Square square = new Square(4);
        Triangle triangle = new Triangle(4, 2);

        //When
        double result = circle.getField() + square.getField() + triangle.getField();

        //Then
        Assert.assertEquals(32.57, result, 0.01);
    }

    @Test
    public void testShowTheEmptyList() {
        //Given
        ShapeCollector figures = new ShapeCollector();

        //When
        String result = figures.showFigures();

        //Then
        Assert.assertTrue(result.isEmpty() == true);
    }

    @Test
    public void testGetFigureWithArgumentLessThanZero() {
        //Given
        ShapeCollector figures = new ShapeCollector();

        //When
        String figure = figures.getFigure(-2);

        //Then
        Assert.assertTrue(figure.isEmpty() == true);
    }
}