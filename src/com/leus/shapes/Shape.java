package com.leus.shapes;

import com.leus.ColorsOfShapes;

public abstract class Shape {

    private ColorsOfShapes color;

    protected String name;
    protected double area;

    public Shape(ColorsOfShapes color) {
        this.color = color;
    }

    public ColorsOfShapes getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

    public abstract void draw();

    protected abstract double calculationArea();
}
