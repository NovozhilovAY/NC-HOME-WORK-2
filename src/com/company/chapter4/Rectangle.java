package com.company.chapter4;

import com.company.chapter2.Point;

public class Rectangle extends Shape implements Cloneable{
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point(super.point.getX() + width / 2 , super.point.getY() - height / 2);
    }

    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        Rectangle newRectangle = (Rectangle) super.clone();
        newRectangle.point = point.clone();
        return newRectangle;
    }
}
