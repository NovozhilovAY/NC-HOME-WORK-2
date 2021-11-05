package com.company.chapter2;

public class Point implements Cloneable{
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point translate(double dx, double dy) {
        return new Point(x + dx, y + dy);
    }

    public Point scale(double coefficient) {
        return new Point(x * coefficient, y * coefficient);
    }

    @Override
    public Point clone() throws CloneNotSupportedException {
        return (Point)super.clone();
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
