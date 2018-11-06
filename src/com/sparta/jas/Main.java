package com.sparta.jas;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] inputArray = {1, 15, 8, 7, 16, 35, 26, 4, 29, 8};
        QuickSort sorter = new QuickSort();
        int[] quickSortedArray = sorter.quickSort(inputArray);
        System.out.println("Starting Array: " + Arrays.toString(inputArray));
        System.out.println("   Final Array: " + Arrays.toString(quickSortedArray));
    }
}
