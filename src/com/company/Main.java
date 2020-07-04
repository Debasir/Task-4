package com.company;


import lib.ArrayUtils;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
    int[] arr = ArrayUtils.readIntArrayFromFile("numbers.txt");
    String[] fixed = Arrays.toString(ArrayUtils.readLinesFromFile("fixed.txt")).split(" ");
    boolean[] boolFixed = new boolean[arr.length];
    for (int i = 0; i < arr.length; i++) {
        if (i >= fixed.length) {
            boolFixed[i] = true;
        } else {
            if (fixed[i].equals("f")) {
                boolFixed[i] = false;
            }
            if (fixed[i].equals("t")) {
                boolFixed[i] = true;
            }
        }
    }
    System.out.println(MyBubbleSort.sort(arr, boolFixed));
    }
}
