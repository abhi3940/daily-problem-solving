package com.company.leetcode;

public class subseqString {
    public static void main(String[] args) {
       boolean a = isSubsequence("aaaaaa", "bbaaaa");
        System.out.println(a);
    }
    public static boolean isSubsequence(String s, String t) {
        int j=0;

        for(int i=0;i<s.length();i++){
            boolean no_break = true;
            while(j<t.length()){
                if(s.charAt(i)==t.charAt(j)){
                    no_break = false;
                    break ;
                }
                if(j==t.length()-1) return false;
                j++;
            }
            if(no_break) return false;
            else  j++;

        }
        return true;

    }

}
