package com.buglife.jun.sort;
/**
 * This class provides one sort method for sorting int element with fast sort
 * Algorithm.
 * 
 * @author Jun
 * 
 */
public class FastSort {
    /**
     * The given elements.
     */
    private int[] elements;
    /**
     * Represents each element's location in array.
     */
    private int pointer;

    /**
     * 
     */
    public FastSort(int[] elements) {
        this.elements = elements;
    }

    /**
     * Sort the given elements.
     * 
     * @param values
     */
    public void sort(int[] values) {
        // check for empty or null array
        if (values == null || values.length == 0) {
            return;
        }
        this.elements = values;
        pointer = values.length;
        fastkSort(0, pointer - 1);
    }

    /**
     * Implements sort function with fast sort Algorithm
     * 
     * @param low
     * @param high
     */
    private void fastkSort(int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = elements[low + (high - low) / 2];

        // Divide the given elements into two parts
        while (i <= j) {
            while (elements[i] < pivot) {
                i++;
            }
            while (elements[j] > pivot) {
                j--;
            }

            if (i <= j) {
                changeLocation(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            fastkSort(low, j);
        if (i < high)
            fastkSort(i, high);
    }

    /**
     * Exchange element's location in the given array
     * 
     * @param i
     * @param j
     */
    private void changeLocation(int i, int j) {
        int temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }
}
