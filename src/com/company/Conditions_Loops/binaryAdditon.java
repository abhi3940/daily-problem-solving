package com.company.Conditions_Loops;

public class binaryAdditon {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        int ans = badd(n1,n2);
        System.out.println(ans);
    }

      static int badd(int n1, int n2){
        int carry =0;
        String ans = "";
        while(n1>0||n2>0){


            int d = n1%10;
            int e = n2%10;
            if(d==1&&e==1){
                if(carry==0) ans = "0"+ans;
                else ans = "1"+ans;
                carry =1;
            }
            else if(d==0&&e==0){
                if(carry==0) ans = "0"+ans;
                else ans = "1"+ans;
                carry =0;
            }
            else if(d==1&&e==0){
                if(carry==0){
                    ans = "1"+ans;
                    carry =0;
                }
                else {
                    ans = "0"+ans;
                    carry =1;
                }
            }
            else if(d==0&&e==1){
                if(carry==0){
                    ans = "1"+ans;
                    carry =0;
                }
                else {
                    ans = "0"+ans;
                    carry =1;
                }
            }
            n1=n1/10;
            n2=n2/10;
        }
        if(carry==1){
            ans="1"+ans;
        }
        return  Integer.parseInt(ans);
      }
}
