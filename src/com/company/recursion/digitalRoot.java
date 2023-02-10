package com.company.recursion;

public class digitalRoot {
    public static void main(String[] args) {
        int ans = digitalRoot(5474);
        System.out.println(ans);
    }
    static int digitalRoot(int n){

        if(n<10){
            return n;
        }
        int ans;
        if(n>=10){
            ans = digitalRoot(n/10)+n%10;
        }else{
            ans = n;
            return ans;
        }
        if(ans<9){
            return ans;
        }else{
            digitalRoot(ans);
        }

//
        return ans;

    }
}

