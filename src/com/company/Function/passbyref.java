package com.company.Function;

public class passbyref {
    public static void main(String[] args) {
        int a = 10;
        int b = refvalue(a);
        System.out.println(b);
        System.out.println(a);
    }

    static int refvalue( int n){
        return n+5;
    }

}
