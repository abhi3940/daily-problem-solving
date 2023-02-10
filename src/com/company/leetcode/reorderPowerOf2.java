package com.company.leetcode;
//https://leetcode.com/problems/reordered-power-of-2/


public class reorderPowerOf2 {
    public static void main(String[] args) {
//        int n = 10;
//        int count =digitCount(n);
//        for(int i=0;i<count;i++){
//            int check = n;
//        }

        int n = 2;
        n = n<<1;
        System.out.println(n);
    }
    public static boolean isPower(int a){
        if(a == 0)
            return true;
        else if( a == 1)
            return false;
        isPower(a/2);

        return false;
    }
    public static int digitCount(int b){
        int count = 0;
        while(b>0){
            count++;
            b = b/10;
        }
        return count;
    }
}
