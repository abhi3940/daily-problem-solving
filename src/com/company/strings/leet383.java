package com.company.strings;
//https://leetcode.com/problems/ransom-note/
public class leet383 {
    public static void main(String[] args) {
        int count = 0;
        int i =0;
        String magazine="b";
        String ransomNote = "a";
        while(i<ransomNote.length()){

            for(int j = 0; j<magazine.length(); j++){
                if(ransomNote.indexOf(i) == magazine.indexOf(j))
                {
                    
                    i = i+1;
                    count ++;
                }

            }


        }
        if(count >= ransomNote.length()){
            System.out.println("true");;
        }else
        {
            System.out.println("false");
        }
    }

}


