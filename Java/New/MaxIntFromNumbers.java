package com.suru.test;

import java.util.Arrays;
import java.util.Comparator;

public class MaxIntFromNumbers {
    public static void main(String[] args) {
        Integer[] ints = {0, 6, 3, 1, 2, 9, 5};
        Arrays.sort(ints, Comparator.reverseOrder());
        String s = Arrays.toString(ints).replaceAll("[\\s,\\[\\]]", "");
        System.out.println(s);
    }
}
