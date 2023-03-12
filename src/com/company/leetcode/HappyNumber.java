package com.company.leetcode;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(findSquare(7));
    }
    public static boolean findSquare(int n){
        if(n==1) return true;
        else if(n<10) return false;
        int sum = 0;
        while(n>0){
            int dig = n%10;
            sum+=dig*dig;
            n/=10;
        }
       // findSquare(sum);
        if(findSquare(sum)) return true;
        else return false;
    }
}
