package com.leus.shapes;

import com.leus.ColorsOfShapes;

import java.text.DecimalFormat;

public abstract class Shape {

    private ColorsOfShapes color;

    String name;
    DecimalFormat dFormat = new DecimalFormat("#.0");

    public Shape(ColorsOfShapes color) {
        this.color = color;
    }

    public ColorsOfShapes getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract void draw();
}
