package com.codegym.sort;

public class SelectionSort implements Sorter {
    @Override
    public int[] sort(int[] inputArray) {
        for (int i = 0; i < inputArray.length - 1; i++) {
            int min = inputArray[i];
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[j] < min) {
                    min = inputArray[j];
                    inputArray[j] = inputArray[i];
                    inputArray[i] = min;
                }
            }
        }
        return inputArray;
    }
}
