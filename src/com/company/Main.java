package com.company;

import com.company.chapter1.*;
import com.company.chapter2.Car;
import com.company.chapter2.Point;

public class Main {
    public static void main(String[] args) {
        //Ex1.run();
        //Ex2.run();
        //Ex3.run();
        //Ex4.run();
        //Ex6.run();
        //Ex13.run();
        Point p = new Point(3,4).translate(1, 3).scale(0.5);
        System.out.println(p);
        Car car = new Car(0.0, 40.0, 40.0, 5.0);
        car.move(100);

        System.out.println(car);

        car.refuel(15);
        System.out.println(car);




    }
}
