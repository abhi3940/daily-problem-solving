package com.company.Function;

public class sumOfNaturalNo {
    public static void main(String[] args) {
        System.out.println(sum(0));
    }
    static int sum(int n){
        if(n<1){
            System.out.println("not a natural number");
            return 0;
        }
        int ans =0;
        for (int i = 1; i <=n ; i++) {
            ans +=i;
        }
        return ans;
    }
}
