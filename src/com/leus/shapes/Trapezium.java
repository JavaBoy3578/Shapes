package com.leus.shapes;

import com.leus.ColorsOfShapes;

public class Trapezium extends Shape {

    private double firstBase;
    private double secondBase;
    private double height;

    public Trapezium(double firstBase, double secondBase, double height, ColorsOfShapes color) {
        super(color);

        if ((firstBase <= 0 || secondBase <= 0) && (Double.isNaN(firstBase) || Double.isNaN(secondBase))) {
            throw new IllegalArgumentException("Bases can't be 0, negative or NaN: " + firstBase + ", " + secondBase);
        }

        name = "трапеция";
        this.firstBase = Math.floor(firstBase * 10) / 10;
        this.secondBase = Math.floor(secondBase * 10) / 10;
        this.height = Math.floor(height * 10) / 10;
    }

    @Override
    public double getArea() {
        return Math.floor((((firstBase + secondBase) / 2) * height) * 10) / 10;
    }

    public double getMiddleLine() {
        return Math.floor(getArea() / height * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println("Фигура: " + name + ", площадь: " + getArea() + " кв. ед., средняя линия: " + getMiddleLine() + " ед., цвет: " + getColor().getColorAsString());
    }
}
