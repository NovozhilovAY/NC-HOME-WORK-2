package com.company;

import com.company.chapter1.*;
import com.company.chapter2.Car;
import com.company.chapter2.Point;
import com.company.chapter3.Employee;
import com.company.chapter3.Measurable;
import com.company.chapter4.Circle;
import com.company.chapter4.Line;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

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


        Employee[] employees = {new Employee(1,"fn1","ln1", 10000 ),
                                new Employee(1,"fn2","ln2", 1500 ),
                                new Employee(1,"fn3","ln3", 2000 ),
                                new Employee(1,"fn4","ln4", 25110 )};
        System.out.println(average(employees));

        Measurable max = largest(employees);
        System.out.println("Employee with the largest salary - " + ((Employee) max).getName());

        Point p1 = new Point(1,1);
        Point p2 = new Point(2, 3);
        Line line = new Line(p1, p2);
        Line line2 = line.clone();


        System.out.println(line);
        System.out.println(line2);
        System.out.println();
        p1.setX(5);
        p1.setY(5);
        p2.setX(5);
        p2.setY(5);
        System.out.println(line);
        System.out.println(line2);

        Circle circle = new Circle(p1, 10);
        Circle circle1 = circle.clone();



    }

    public static double average(Measurable[] objects) {
        double sum = 0.0;
        for (Measurable i : objects) {
            sum += i.getMeasure();
        }
        return (objects.length == 0) ? (0.0) : (sum / objects.length);
    }

    public static Measurable largest(Measurable[] objects) {
        Measurable max = objects[0];
        for (int i = 1; i < objects.length; i++) {
            if(Double.compare(max.getMeasure(), objects[i].getMeasure()) < 0)  {
                max = objects[i];
            }
        }
        return max;
    }
}
