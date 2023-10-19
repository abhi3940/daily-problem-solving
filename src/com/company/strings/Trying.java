package com.company.strings;

import java.util.Scanner;

public class Trying {

    public static void maxConsecutiveSwimmingDays(String A, int K) {
        int left = 0, right = 0;
        int maxSwimmingDays = 0;
        int zeroCount = 0;

        while (right < A.length()) {
            if (A.charAt(right) == '0') {
                zeroCount++;
            }

            // Shrink the window if zeroCount exceeds K
            while (zeroCount > K) {
                if (A.charAt(left) == '0') {
                    zeroCount--;
                }
                left++;
            }

            // Update the maximum swimming days
            maxSwimmingDays = Math.max(maxSwimmingDays, right - left + 1);
            right++;
        }

        System.out.println(maxSwimmingDays);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String A = scanner.nextLine().trim(); // Trim to remove leading/trailing whitespace



        scanner.close();
    }
}
