package com.codegym.sort;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {2, 9, 5, 4, 8, 1};
	    GetSorter getSorter = new GetSorter();
	    Sorter sorter = getSorter.getSorter();
	    sorter.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
    }
}
