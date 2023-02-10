package com.company.complexity;

import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        int sum =0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //int n = 3;
        for (int i = 1; i <=n ; i++) {
            System.out.println();
            System.out.println("i = "+i);
            for (int j = 1; j <=n ; j=i+2) {
                System.out.print("j = " +j);

                sum = sum +j;
                System.out.println( "   sum = "+sum);
            }
        }
    }
}
