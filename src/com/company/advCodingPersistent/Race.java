package com.company.advCodingPersistent;

public class Race {
    public static void main(String[] args) {
        int[] a = {4,1,3};
        int[] b = {2,2,7};
        winner(a,b);
    }
    public static void winner(int[] a,int[] b){
        int am = 0,bm=0,as=0,bs=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>am)am=a[i];
            as+= a[i];
            if(b[i]>bm)bm=b[i];
            bs+=b[i];
        }
        if(as-am>bs-bm) System.out.println("bob");
        else if (as-am<bs-bm) System.out.println("alice");
        else System.out.println("draw");
    }
}
