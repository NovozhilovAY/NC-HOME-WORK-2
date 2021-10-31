package com.company.chapter1;

import java.util.Scanner;

public class Ex3 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n1: ");
        int n1 = scanner.nextInt();
        System.out.print("Input n2: ");
        int n2 = scanner.nextInt();
        System.out.print("Input n3: ");
        int n3 = scanner.nextInt();

        System.out.println("(v1)The largest number: " + maxConditional(n1, n2, n3));
        System.out.println("(v2)The largest number: " + maxMath(n1, n2, n3));

    }

    private static int maxConditional(int n1, int n2, int n3) {
        int largestNumber = n1;
        if(largestNumber < n2) largestNumber = n2;
        if(largestNumber < n3) largestNumber = n3;
        return largestNumber;
    }

    private static int maxMath(int n1, int n2, int n3) {
        int largestNumber = Math.max(n1,n2);
        return Math.max(largestNumber, n3);
    }

}
