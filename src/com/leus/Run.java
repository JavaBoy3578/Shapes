package com.leus;

import com.leus.shapes.Shape;

public class Run {

    public static void main(String[] args) {
        Shape[] shapeArr = ShapesRandomGenerator.createRandomShapesArr();

        for (Shape elem : shapeArr) {
            elem.draw();
        }
    }

}
