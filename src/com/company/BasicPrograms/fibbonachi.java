package com.company.BasicPrograms;

import java.util.ArrayList;

public class fibbonachi {
    public static void main(String[] args) {
        fibbo(7);
    }
    static void fibbo(int n){
       int n1 = 0, n2 = 1,n3;
        System.out.print(n1+" "+n2+" ");
        for (int i = 2; i <n ; ++i) {
            n3 = n1 + n2;
            System.out.print(n3+" ");
            n1 = n2;
            n2 = n3;
        }
    }
}
