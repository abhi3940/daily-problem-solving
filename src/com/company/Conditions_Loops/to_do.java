package com.company.Conditions_Loops;

import java.util.Scanner;

public class to_do {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        int level;
        for (int i = 0; i < testCase; i++) {
            int NoofQue = sc.nextInt();
            int count =0;
            for (int j = 0; j < NoofQue; j++) {
                level = sc.nextInt();
                if(level>=1000) {
                    count = count+1;
                }
            }
            System.out.println(count);
        }

    }
}
