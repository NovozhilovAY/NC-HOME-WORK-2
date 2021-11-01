package com.company.chapter1;

import java.math.BigInteger;

public class Ex6 {
    public static void run() {
        System.out.println("1000! = " + factorial(1000));
    }

    private static BigInteger factorial(int number) {
        BigInteger f = BigInteger.valueOf(1);
        for(int i = 2; i <= number; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}
