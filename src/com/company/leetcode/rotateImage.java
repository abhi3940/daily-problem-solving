//package com.company.leetcode;
////https://leetcode.com/problems/rotate-image/
//
//import java.util.Arrays;
//
//public class rotateImage {
//    public static void main(String[] args) {
//        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(Arrays.deepToString(matrix));
//        int l= 0;
//        int r = matrix.length-1;


//        while (l<=r){
//            for (int i = 0; i < r; i++) {
//                int top = l;
//                int bottom = r;
//                //save top left
//                int topleft = matrix[top][l+i];
//                //move bottom right to top left
//                matrix[top][l+i]=matrix[bottom-i][l];
//                //move bottm right to bottom left
//                matrix[bottom-i][l] = matrix[bottom][r-i];
//                //move top right to bottom right
//                matrix[bottom][r-i] = matrix[top+i][r];
//                //move topleft to top right
//                matrix[top+i][r] = topleft;
//            }
//            l++;
//            r--;
//            System.out.println(Arrays.deepToString(matrix));
//        }


//        int n = matrix.length;
//        int layers = n/2;

//        for(int l=0;l<layers;l++){
//            int start = l;
//            int end = n-1;

//            for(int i=start;i<end;i++){
//                int temp = matrix[start][i];
//                matrix[start][i] = matrix[n-i-1][start];
//                matrix[n-i-1][start] = matrix[end][n-1-i];
//                matrix[end][n-1-i] = matrix[i][end];
//                matrix[i][end] = temp;
//            }
//        }
//
//        int n = matrix.length;
//        int layers = n/2;
//        for (int layer = 0; layer < layers; layer++) {
//            int start = layer;
//            int end = n-1-layer;
//            for (int i = start; i < end; i++) {
//                //top in temp
//                int temp = matrix[start][i];
//                //left in top
//                matrix[start][i] = matrix[n-1-i][start];
//                //bottom in left
//                matrix[n-1-i][start] = matrix[end][n-1-i];
//                //right in bottom
//                matrix[end][n-1-i] = matrix[i][end];
//                //top in right
//                matrix[i][end] = temp;
//            }
//        }
//
//
//
//    }

//    static  void swap(int i, int j ){
//        int temp =  i;
//        i = j;
//        j = temp;
//    }

//}
