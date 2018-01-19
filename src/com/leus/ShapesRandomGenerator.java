package com.leus;

import com.leus.shapes.*;

import java.util.Random;

public class ShapesRandomGenerator {

    private static Random rand = new Random();

    public static Shape[] createRandomShapesArr() {
        Shape[] result = new Shape[rand.nextInt(20)];

        for (int i = 0; i < result.length; i++) {
            result[i] = createRandomShape(rand.nextInt(4) + 1);
        }

        return result;
    }

    private static Shape createRandomShape(int num) {
        switch (num) {
            case 1:
                return createRandomSquare();
            case 2:
                return createRandomTriangle();
            case 3:
                return createRandomCircle();
            case 4:
                return createRandomTrapezium();
            default:
                throw new IllegalArgumentException("num must be >= 1 && <= 4, current number is : " + num);
        }
    }

    private static Square createRandomSquare() {
        return new Square(rand.nextDouble() * 100, ColorsOfShapes.getColorFromNumber(rand.nextInt(10) + 1));
    }

    private static Triangle createRandomTriangle() {
        return new Triangle(rand.nextDouble() * 50, rand.nextDouble() * 50, ColorsOfShapes.getColorFromNumber(rand.nextInt(10) + 1));
    }

    private static Circle createRandomCircle() {
        return new Circle(rand.nextDouble() * 50, ColorsOfShapes.getColorFromNumber(rand.nextInt(10) + 1));
    }

    private static Trapezium createRandomTrapezium() {
        return new Trapezium(rand.nextDouble() * 100, rand.nextDouble() * 100, rand.nextDouble() * 50, ColorsOfShapes.getColorFromNumber(rand.nextInt(10) + 1));
    }

}
