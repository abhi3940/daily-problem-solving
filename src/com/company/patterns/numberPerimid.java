package com.company.patterns;

public class numberPerimid {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        int spaces,number;
        for (int i = 1; i <= n; i++) {
            spaces=n-i;
            for (int j = 1; j < 2*n-(n-i); j++) {
                number = j<=n?n-j+1:j-n+1;
                if(j>spaces) System.out.print(number+" ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
