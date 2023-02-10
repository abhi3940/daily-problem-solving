package com.company.Conditions_Loops;

public class primeFactor {
    public static void main(String[] args) {
        primefactor(600022);
    }
    static void primefactor(int n){
        while (n%2==0){
            System.out.print(2 +" ");
            n/=2;
        }
        for (int i = 3; i <Math.sqrt(n) ; i+=2) {
            while (n%i==0){
                System.out.print(i+" ");
                n/=i;
            }
        }
        //for the case when n is still greater than 2
        if(n>2){
            System.out.print(n);
        }
    }
}
