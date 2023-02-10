package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4},{5,6},{7,8}};
        exchangeAnyTwoRows(arr,1,2);
    }
    public static void exchangeAnyTwoRows(int[][] matrix,
                                          int K, int L)
    {
        for (int i = 0; i < matrix[0].length; i++) {

            // Swap two numbers
            int temp = matrix[K][i];
            matrix[K][i] = matrix[L][i];
            matrix[L][i] = temp;
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
