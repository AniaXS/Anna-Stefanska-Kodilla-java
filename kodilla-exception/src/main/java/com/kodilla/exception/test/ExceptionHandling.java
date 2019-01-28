package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(1.5, 11));
        } catch (Exception e) {
            System.out.println("Change function's arguments");
        } finally {
            System.out.println("Situation is always under control");
        }
    }
}
