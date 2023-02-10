package com.company.leetcode;

import java.util.Arrays;

public class maxStock {
    public static void main(String[] args) {
        int[] arr ={7,1,5,3,6,4};
        //maxProfit(arr);
        String s = "aaaaa";
      //  System.out.println(char c: s.toCharArray());
    }
    public static int maxProfit(int[] prices) {
        int[] temp = prices;
        System.out.println(Arrays.toString(temp));
        Arrays.sort(prices);
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString((prices)));
        int start = 0;
        int len = prices.length -1;
        while(temp[start]<temp[len]){
            if(Arrays.binarySearch(prices,start )<Arrays.binarySearch(prices, len)) return temp[start]-temp[len];
            start++;
            len--;
        }
        return 0;
    }

    public static int maxProfit2(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }
}
