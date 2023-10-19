package com.company.arrays;

public class anoArray {
    public static void main(String[] args) {
        int[] diff ={-2,-1,-2,5};
        int low = 3;
        int high = 10;
        int ans = calcNum(diff,low,high);
        System.out.println(ans);
    }
    static int calcNum(int[] diff, int low, int high){
        int count=0;
        boolean toCount=true;
        while(low<high){
            int dig =low;
            for(int i=0;i<diff.length;i++){
                dig=dig-diff[i];
                if(dig<low||dig>high){
                    toCount=false;
                    break;
                }
            }
            if(toCount) count++;
            low++;
        }
        return count;
    }
}
