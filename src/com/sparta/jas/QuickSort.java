package com.sparta.jas;

public class QuickSort {
    public int[] quickSort(int[] input){
        int[] quickSortedArray;

        // Set up Pivot
        int pivot = input.length/2;

        // Run the pass to determine partitions and pivot points
        Partition split = new Partition();
        int[][] splitArrays = split.partition(input, pivot);
        int[] midArray = splitArrays[0];
        int[] lowArray = splitArrays[1];
        int[] highArray = splitArrays[2];

        // Check the size of each array to see if they have one or less value. If not, re-run quickSort on the new arrays.
        if(lowArray.length > 1){
            lowArray = quickSort(lowArray);
        }
        if(highArray.length > 1){
            highArray = quickSort(highArray);
        }

        // Merge partitions into a sorted version of the input array
        Merge midMerge = new Merge(lowArray, midArray);
        quickSortedArray = midMerge.merge();

        Merge performMerge = new Merge(quickSortedArray, highArray);
        quickSortedArray = performMerge.merge();

        return quickSortedArray;
    }
}
