package com.company.BasicPrograms;

public class alice {
    public static void main(String[] args) {
        System.out.println(ans(100,103));
    }
    static int ans(int a, int b){
        int first = a%10;
        int sec = b%10;
        if (Math.max(a,b)==a&&Math.max(first,sec)==first)return 1;
        if (Math.max(a,b)==b&&Math.max(first,sec)==sec)return 1;
        return 0;
    }
}
