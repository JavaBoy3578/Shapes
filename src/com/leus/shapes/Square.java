package com.leus.shapes;

import com.leus.ColorsOfShapes;

public class Square extends Shape {
    private double side;

    public Square(double side, ColorsOfShapes color) {
        super(color);

        if (side <= 0 || Double.isNaN(side)) {
            throw new IllegalArgumentException("Side can't be 0, negative or NaN: " + side);
        }

        name = "квадрат";
        this.side = Math.floor(side * 10) / 10;
    }

    @Override
    public double getArea() {
        return Math.floor(Math.pow(side, 2) * 10) / 10;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Фигура: " + name + ", площадь: " + getArea() + " кв. ед., длина стороны: " + getSide() + " ед., цвет: " + getColor().getColorAsString());
    }
}
