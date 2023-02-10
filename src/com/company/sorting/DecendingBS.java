package com.company.sorting;

public class DecendingBS {
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1};
        boublesort(arr);
    }

    private static void boublesort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1]<arr[j]){

                }
            }
        }
    }
}
