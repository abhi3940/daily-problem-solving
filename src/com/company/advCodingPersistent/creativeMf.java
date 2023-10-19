package com.company.advCodingPersistent;

public class creativeMf {
    public static void main(String[] args) {
        int a = cmf(9);
        System.out.println(a);
    }
    public static int cmf(int n){
        int count =2;
        if(n==0)return 0;
        else if(n==1)return 00;
        else if(n==2)return 2;
        for (int i = 3; i <= n; i++) {
            int p=0;
            while (Math.pow(i,p)<n) p++;
            p=p-1;
            if(2*Math.pow(i,p)>n) count++;
        }
        return count;
    }
}
