package com.company.arrays;

import java.util.Scanner;

public class beutifulTree {
    static int beautifulNodes(int N, int[] A) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            int children = 0;
            for (int j = 0; j < N - 1; j++) {
                if (A[j] == i&!isParent(j,A)) children++;

            }
            if (children >= 3) count++;
        }
        return count;
    }

    private static boolean isParent(int j,int[] A) {
        for (int i = 0; i < A.length; i++) if(j==A[i]) return true;
        return false;
    }

    public static void main(String[] args) {

        int N =8 ;

         int[] A = {1,1,1,1,3,3,3};

        int result = beautifulNodes(N, A);
        System.out.println(result);
    }
}
