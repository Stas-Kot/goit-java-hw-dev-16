package com.goit.feature;

public class App {
    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();
        System.out.println("sumCalculator.sum(5) = " + sumCalculator.sum(5));
        System.out.println("sumCalculator.sum(5) = " + sumCalculator.sum(3));
    }
}
