package com.company;

import java.util.Arrays;

public class MyBubbleSort {

    public static String sort(int[] arr, boolean[] fixed) {
        for (int i = 0; i < arr.length; i++) {
            if (fixed[i]) {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] > (arr[j + 1]) && (fixed[j])) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            } else {
                i++;
            }
        }
        return Arrays.toString(arr);
    }
}
