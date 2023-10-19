package com.company.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class moveZeros {
    public static void main(String[] args) {
        int[] arr={1,2,3,0,4};
         whyisIt(arr);
    }
    static void whyisIt(int[] nums) {
        int len = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<len;i++){
            hm.put(i,nums[i]);
            nums[i]=0;
        }
        int n=0,c=0;
        while(c<len){
            if((int)hm.get(n)!=0){
                nums[n]=hm.get(n);
                n++;
            }
            c++;
        }
        System.out.println(hm.get(4));
        System.out.println(Arrays.toString(nums));
    }
}
