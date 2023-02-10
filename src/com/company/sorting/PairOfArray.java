package com.company.sorting;

import java.util.Arrays;

public class PairOfArray {
    public static void main(String[] args) {
        int n = 4;
        int[][] arr = {{1,2},{3,4},{5,6},{7,8}};
        sortPair(n,arr);
    }
    static void sortPair(int n,int[][] arr){
        if(n<=1)
            return;
        boolean swaped;
        for (int i = 0; i < n; i++) {
            swaped = false;
            for (int j = 1; j < n-i; j++) {
                if (arr[j-1][0] < arr[j][0]) {
                    exchangeAnyTwoRows(arr,j-1,j);
                    swaped = true;
                }
                if(arr[j-1]==arr[j]){
                    if(arr[j-1][1] < arr[j][1]){
                        exchangeAnyTwoRows(arr,j-1,j);
                        swaped = true;
                    }
                }
                if(!swaped)
                    break;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

    public static void exchangeAnyTwoRows(int[][] matrix,
                                          int K, int L)
    {
        for (int i = 0; i < matrix[0].length; i++) {

            // Swap two numbers
            int temp = matrix[K][i];
            matrix[K ][i] = matrix[L][i];
            matrix[L ][i] = temp;
        }

    }
}
