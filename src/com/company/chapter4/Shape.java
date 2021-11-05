package com.company.chapter4;

import com.company.chapter2.Point;

public abstract class Shape{
    protected Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {
        point = point.translate(dx, dy);
    }

    public abstract Point getCenter();
}
