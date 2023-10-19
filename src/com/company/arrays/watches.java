package com.company.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class watches {
    static int noOfWatches(int[] watches,int k){
        Map<Integer, Integer> priceDiffCount = new HashMap<>();

        int totalCombinations = 0;
        for (int watch : watches) {
            int partnerPrice = watch + k;
            if (priceDiffCount.containsKey(partnerPrice)) {
                totalCombinations += priceDiffCount.get(partnerPrice);
            }
            priceDiffCount.put(watch, priceDiffCount.getOrDefault(watch, 0) + 1);
        }

        return totalCombinations;
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of wristwatches
        int noOfWatches = scanner.nextInt();

        // Read the prices of the wristwatches
        int[] prices = new int[noOfWatches];
        for (int i = 0; i < noOfWatches; i++) {
            prices[i] = scanner.nextInt();
        }

        // Read the given value K
        int K = scanner.nextInt();

        int result = noOfWatches(prices, K);
        System.out.println("Total combinations for lifetime discount coupons: " + result);
    }
    }

