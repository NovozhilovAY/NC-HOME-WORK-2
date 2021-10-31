package com.company.chapter1;

import java.util.Scanner;

public class Ex2 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input integer angle (may be positive or negative): ");
        int angle = scanner.nextInt();

        System.out.print("florMod: ");
        System.out.println(Math.floorMod(angle, 360));

        System.out.print("%: ");
        System.out.println((angle % 360 + 360) % 360);
    }
}
