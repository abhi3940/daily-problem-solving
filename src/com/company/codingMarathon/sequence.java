package com.company.codingMarathon;

import java.util.Scanner;

public class sequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (N == 2 )
        {
            System.out.println(2);
        }
        else if(N > 2)
        {
            int nuSeq = (N-2)*c(9,1)*fact(3);
            System.out.println(nuSeq);
        }
    }
    static int c(int a, int b)
    {
        return fact(a)/(fact(b)*fact(a-b));
    }
    static int fact(int d)
    {
        int f = 1;
        if(d == 0 || d == 1){
            return 1;
        }else{
            for(int i = 1;i<= d; i++ ){
                f = f*i;
            }
            return f;
        }
    }
    }

