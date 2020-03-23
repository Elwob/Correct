package com.company;

public class Rectangle extends GeometricFigure {

    @Override
    public double calculateArea(double a) {
        return 0;
    }

    @Override
    public double calculateArea(double a, double b) {
        return a * b;
    }
}
