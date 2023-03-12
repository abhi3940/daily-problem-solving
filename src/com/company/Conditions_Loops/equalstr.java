package com.company.Conditions_Loops;

import java.util.Scanner;

public class equalstr {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        String ans ="";
        char b ='B';
        char g ='G';
        int a = s.nextInt();
        for (int i=0;i<a ;i++ ){
            String sr = s.next();
            String tr = s.next();

            for(int j=0;j<5;j++){
                if(sr.charAt(j)==tr.charAt(j)){
                    ans = ans + g;
                }
                else{ans = ans + b;}
            }
            System.out.println(ans);
        }
    }
}
