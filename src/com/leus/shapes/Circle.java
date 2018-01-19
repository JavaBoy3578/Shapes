package com.leus.shapes;

import com.leus.ColorsOfShapes;

public class Circle extends Shape {

    private double diameter;

    public Circle(double diameter, ColorsOfShapes color) {
        super(color);

        if (diameter <= 0 || Double.isNaN(diameter)) {
            throw new IllegalArgumentException("Diameter can't be 0, negative or NaN: " + diameter);
        }

        name = "круг";
        this.diameter = Math.floor(diameter * 10) / 10;
    }

    public double getRadius() {
        return Math.floor(diameter / 2 * 10) / 10;
    }

    @Override
    public double getArea() {
        return Math.floor((Math.floor(Math.pow(getRadius(), 2) * 10) / 10) * (Math.floor(Math.PI * 100) / 100) * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println("Фигура: " + name + ", площадь: " + getArea() + " кв. ед., радиус: " + getRadius() + " ед., цвет: " + getColor().getColorAsString());
    }
}
