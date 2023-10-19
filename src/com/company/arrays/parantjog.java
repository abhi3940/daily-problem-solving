package com.company.arrays;

import java.util.Arrays;

public class parantjog {
    public static void main(String[] args) {
        int[] ans = new int[2];
        ans = commonFootSteps(3,2,2,20);
        System.out.println(Arrays.toString(ans));
    }
    static int[] commonFootSteps(int parentPos, int childPos, int velFather, int steps) {

        int[] answer = new int[2];
        int[] temp = new int[steps + 1];
        for (int i = 0; i <= steps; i++)
            temp[i] = parentPos + velFather * i - childPos;
        for (int i = 0; i <= steps; i++) {
            if (temp[i] <= 0)
                continue;
            int v2 = temp[i];
            int count = 0;
            for (int j = i; j <= steps; j++) {
                if (temp[j] % v2 == 0)
                    count++;
            }

            if (answer[0] <= count) {
                answer[0] = count;
                answer[1] = v2;
            }
        }

        return answer;

    }
}
