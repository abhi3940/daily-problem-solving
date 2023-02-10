package com.company.BasicPrograms;

public class palindromeString {
    public static void main(String[] args) {
        System.out.println(isPalindrone("cpacapcc"));
    }
    static boolean isPalindrone(String str){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(str.length()-i-1) ){
                //do nothing
            }else
                return false;
        }
        return true;
    }
}
