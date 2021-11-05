package com.company.chapter4;

import com.company.chapter2.Point;

public class Circle extends Shape implements Cloneable{
    private double radius;

    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return super.point;
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        Circle newCircle = (Circle)super.clone();
        newCircle.point = point.clone();
        return newCircle;
    }
}
