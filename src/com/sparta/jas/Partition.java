package com.sparta.jas;

public class Partition {
    public int[][] partition(int[] inputArray, int pivot){
        int[][] splitArrays = new int[3][];

        int lowSize = 0;
        int highSize = 0;
        int midSize = 0;
        int lowIndex = 0;
        int highIndex = 0;
        int midIndex = 0;

        // Define size of the output arrays
        for(int i = 0 ; i < inputArray.length; i++){
            if (inputArray[i] == inputArray[pivot]){
                midSize++;
            } else if (inputArray[i]<inputArray[pivot]){
                // lowArray[lowIndex] = inputArray[i];
                lowSize++;
            } else {
                // highArray[highIndex] = inputArray[i];
                highSize++;
            }
        }
        int[] midArray = new int[midSize]; // Can't be 1, needed to prevent errors when there are two indexes with the same value
        int[] lowArray = new int[lowSize];
        int[] highArray = new int[highSize];

        // Fill the output arrays
        for(int i = 0 ; i < inputArray.length; i++){
            if (inputArray[i] == inputArray[pivot]){
                // Needed to prevent stack-overflow error where the pivot of an array doesn't change
                midArray[midIndex] = inputArray[i];
                midIndex++;
            } else if (inputArray[i]<inputArray[pivot]){
                lowArray[lowIndex] = inputArray[i];
                lowIndex++;
            } else {
                highArray[highIndex] = inputArray[i];
                highIndex++;
            }
        }

        // return the output arrays
        splitArrays[0] = midArray;
        splitArrays[1] = lowArray;
        splitArrays[2] = highArray;
        return splitArrays;
    }
}
