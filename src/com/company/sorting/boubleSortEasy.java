package com.company.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

//https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/min-max-difference/
public class boubleSortEasy {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,6,9};
        int m = 3;
        System.out.println(diff(arr,m));;
    }
    //function  to calculate diffrence between minimum and maximum sum
    static int diff(int[] arr, int m){
        int n = arr.length;
        bouleSort(arr);
        System.out.println(Arrays.toString(arr));
        int minsum = 0;
        for (int i = 0; i < n-m ; i++) {
            minsum += arr[i];
        }
        System.out.println(minsum);
        int maxsum = 0;
        for (int i = m; i < n ; i++) {
            maxsum += arr[i];
        }
        System.out.println(maxsum);
        return maxsum-minsum;
    }

    private static void bouleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length -i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
