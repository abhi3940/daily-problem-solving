package com.company.BasicPrograms;

public class ArmsrongNumber {
    public static void main(String[] args) {
        armNo(112, 199);
    }
    static void armNo(int n1, int n2){
        for (int i = n1; i <=n2 ; i++) {
            double sum = 0;
            for (int j = 0; i%10 > 0; j++) {
               sum = sum + Math.pow(i%10,3);
               i = i/10;
            }
            if(sum == i){
                System.out.print(i +" ");
            }
        }
    }
}
