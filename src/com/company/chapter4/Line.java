package com.company.chapter4;

import com.company.chapter2.Point;

public class Line extends Shape implements Cloneable{
    private Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public void moveBy(double dx, double dy) {
        super.moveBy(dx, dy);
        to = to.translate(dx, dy);
    }

    @Override
    public Point getCenter() {
        double newX = (super.point.getX() + to.getX()) / 2.0;
        double newY = (super.point.getY() + to.getY()) / 2.0;
        return new Point(newX, newY);
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        return new Line(point.clone(),to.clone());
    }

    @Override
    public String toString() {
        return "Line{" +
                "to=" + to +
                ", from=" + point +
                '}';
    }
}
