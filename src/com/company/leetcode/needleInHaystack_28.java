package com.company.leetcode;

public class needleInHaystack_28 {
    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "leeto";
        int a = strStr(s1,s2);
        System.out.println(a);
    }
    public static int strStr(String haystack, String needle) {
        int j =0;
        outerloop:
        for(int i =0;i<needle.length();i++){
            while(i<needle.length()&&j<haystack.length()){
                if(needle.charAt(i)==haystack.charAt(j)){
                    if(i==needle.length()-1) return j-i;
                    i++;
                }
                else if(i==needle.length()-1) return -1;
                j++;
            }
        }
        return -1;
    }
}
