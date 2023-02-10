package com.company.leetcode;

public class pangram {
    public static void main(String[] args) {
        String sentence = "abvs";
        for (int j = 97; j < 123; j++) {
            char m = (char) j;
            String s = String.valueOf(m);
            if(sentence.contains(s)){

               // else
                    //return false;
            }
        }
        //return true;




    }
}
