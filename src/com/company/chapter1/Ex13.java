package com.company.chapter1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Ex13 {
    private static Random random = new Random();

    public static void run() {
        ArrayList<Integer> numbers = new ArrayList<>();
        fillArrayList(numbers);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < 6; i++) {
           result.add(pickRandomNumber(numbers));
        }
        Collections.sort(result);
        System.out.println(result);
    }

    private static void fillArrayList(ArrayList<Integer> array) {
        for(int i = 1; i < 50; i++) {
            array.add(i);
        }
    }

    private static int pickRandomNumber(ArrayList<Integer> array) {
        int index = random.nextInt(array.size());
        int number = array.get(index);
        array.remove(index);
        return number;
    }
}
