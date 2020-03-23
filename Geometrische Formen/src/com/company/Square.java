package com.company;

public class Square extends GeometricFigure {

    @Override
    public double calculateArea(double a) {
        return a * a;
    }

    @Override
    public double calculateArea(double a, double b) {
        return 0;
    }
}
