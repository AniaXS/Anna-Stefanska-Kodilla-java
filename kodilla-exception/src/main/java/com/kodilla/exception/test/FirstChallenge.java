package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        double result;
        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
            result = a / b;
        } catch (ArithmeticException e) {
            result = 0;
            System.out.println("This calculation is now allowed. Don't divide by zero!");
        } finally {
            System.out.println("Mission completed");
        }
        return result;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}
