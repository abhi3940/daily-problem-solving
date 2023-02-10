package com.company.leetcode;

import java.util.Arrays;

public class addone {
    public static void main(String[] args) {
        int[] digits = {9};

       int last =digits.length-1;
        int len =digits.length;

//        long digit =0;
//        for(int i=0;i<len;i++){
//            digit += digits[i];
//            digit *= 10;
//        }
//
//        long sum=digit/10+1;
//        int anslen=(int)Math.log10(sum)+1;
//        int[] ans= new int[anslen];
//        for(int i=anslen-1;i>=0;i--){
//            long a = sum%10;
//            ans[i]=(int)a;
//            sum/=10;
//        }

        if(digits[last]==9){
            int carry =1;
            digits[last]=0;
            for (int i = 1; i <len ; i++){
                int ans = digits[last-i]+carry;
                digits[last-i] = ans%10;
                carry=ans/10;

            }
            if(carry==1){
                int ans[] = new int[len+1];
                ans[0]=1;
                for (int i = 1; i <len+1 ; i++) {
                    ans[i]=digits[i-1];
                }
                System.out.println(Arrays.toString(ans));
            }
            System.out.println(Arrays.toString(digits));

        }
        digits[last]+=1;
        System.out.println(Arrays.toString(digits));
    }
}
