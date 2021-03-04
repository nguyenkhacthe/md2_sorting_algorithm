package com.codegym.sort;

public class BubbleSort implements Sorter {


    @Override
    public int[] sort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length - i; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                }
            }
        }
        return inputArray;
    }
}
