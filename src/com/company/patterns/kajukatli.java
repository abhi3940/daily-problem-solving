package com.company.patterns;

public class kajukatli {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for (int i = 1; i < 2*n; i++) {
            for (int j = 1; j <= n; j++) {
                int rel =n-i+1;
                if(rel>0){
                    if(j>=n-i+1) System.out.print("* ");
                    else System.out.print(" ");
                }else{
                    if(j*-1>=n-i) System.out.print(" ");
                    else System.out.print("* ");
                }

                //else if(j*-1==n-1)
            }
            System.out.println();
        }
    }
}
