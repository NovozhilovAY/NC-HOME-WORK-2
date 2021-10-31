package com.company.chapter1;

import java.util.Scanner;

public class Ex1 {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer number: ");
        int number = scanner.nextInt();
        System.out.println("Number in binary representation: " + Integer.toBinaryString(number));
        System.out.println("Number in octal representation: " + Integer.toOctalString(number));
        System.out.println("Number in hexadecimal representation: " + Integer.toHexString(number));
        System.out.println("Reciprocal as a hexadecimal floating-point number: " + Double.toHexString(1.0 / number));
    }
}
