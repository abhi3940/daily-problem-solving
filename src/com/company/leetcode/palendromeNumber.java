package com.company.leetcode;

public class palendromeNumber {
    public static void main(String[] args) {
        boolean a =isPalindrome(121);
        System.out.println(a);
    }
    public static boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int y = x;
        int rev =0;
        for(int i=0;i<Math.log10(x);i++){
            int u = y%10;
            rev = rev*10 + u;
            y=y/10;
        }
        if(rev==x)
            return true;
        else return false;
    }
}
