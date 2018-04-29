package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeList = new ArrayList<>();

    public List<Shape> getShapeList() {
        return shapeList;
    }

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }
    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(shapeList.contains(shape)) {
            shapeList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if(n>=0 && n<shapeList.size()) {
            shape = shapeList.get(n);
        }
        return shape;
    }
    public void showFigures() {
        if(shapeList.size()>0) {
            System.out.println("List contains: ");
            for (Shape shape : shapeList) {
                System.out.println(shape.getShapeName() + ", area: " + shape.getArea());
            }
        }   else {
            System.out.println("List is empty");
        }
    }



    public int getShapeCount() {
        return shapeList.size();
    }
}

