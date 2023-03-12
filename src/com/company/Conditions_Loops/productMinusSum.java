package com.company.Conditions_Loops;

public class productMinusSum {
    public static void main(String[] args) {
        int a = 1234;
        int product =1;
        int sum =0;
        int rem;
        while(a>0){
            rem = a%10;
            a /= 10;
            product *=rem;
            sum += rem;

        }
        System.out.println(product-sum);
    }

}
