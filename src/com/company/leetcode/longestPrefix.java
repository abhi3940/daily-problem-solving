package com.company.leetcode;

import static java.lang.Math.toRadians;

//https://leetcode.com/problems/longest-common-prefix/
public class longestPrefix {
    public static void main(String[] args) {
        String[] fl = {"ab","a"};
        String ans =commonPrefix(fl);
        System.out.println(ans);
    }
    static String commonPrefix(String[] strs){
        String prefix = strs[0];
        String ans = prefix;
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < min(prefix.length(),strs[i].length()); j++) {
                if(strs[0].charAt(j)==strs[i].charAt(j)){
                    ans = prefix.substring(0,j-1);
                }
                else
                    break;
            }
        }
        return ans;
    }
    static int min(int a,int b){
        return (a>b) ?b:a;
    }
}
