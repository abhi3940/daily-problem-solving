package com.company.Conditions_Loops;

public class factorial {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
    static int factorial(int n){
        if(n==0)
            return 1;
        int mul = 1;
        for (int i = 1; i <= n; i++) {
            mul = mul*i;
        }
        return mul;
    }
}
