package com.company.arrays;

public class pass {
    public static void main(String[] args) {
        int x =3;
        int y=2;
        int ans = count(x,y);
        System.out.println(ans);
    }
    static  int count(int n, int k){
        double count =1;
        for (int i = 0; i < n; i++) {
            count*=26;
        }
        count = count -Math.pow(26,n/k);
        return (int) (count % (Math.pow(10,9)-7));
    }
}
