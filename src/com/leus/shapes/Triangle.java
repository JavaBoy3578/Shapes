package com.leus.shapes;

import com.leus.ColorsOfShapes;

public class Triangle extends Shape {

    private double firstCathetus;
    private double secondCathetus;
    private double hypotenuse;

    public Triangle(double firstCathetus, double secondCathetus, ColorsOfShapes color) {
        super(color);

        if ((firstCathetus <= 0 || secondCathetus <= 0) && (Double.isNaN(firstCathetus) || Double.isNaN(secondCathetus))) {
            throw new IllegalArgumentException("Cathetus can't be 0, negative or NaN: " + firstCathetus + ", " + secondCathetus);
        }

        name = "треугольник";
        this.firstCathetus = Math.floor(firstCathetus * 10) / 10;
        this.secondCathetus = Math.floor(secondCathetus * 10) / 10;
        this.hypotenuse = calculationHypotenuse();
    }

    @Override
    public double getArea() {
        return Math.floor((firstCathetus * secondCathetus) / 2 * 10) / 10;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    @Override
    public void draw() {
        System.out.println("Фигура: " + name + ", площадь: " + getArea() + " кв. ед., гипотенуза: " + getHypotenuse() + " ед., цвет: " + getColor().getColorAsString());
    }

    private double calculationHypotenuse() {
        double squareHypotenuse = Math.floor(Math.pow(firstCathetus, 2) * 10) / 10 + Math.floor(Math.pow(secondCathetus, 2) * 10) / 10;

        return Math.floor(Math.sqrt(squareHypotenuse) * 10) / 10;
    }
}
