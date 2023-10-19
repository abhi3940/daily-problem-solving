package com.company.leetcode;

import java.util.HashMap;

public class firstMissingPositive {
    public static void main(String[] args) {
        int[] aee = {3,4,-1,1};
        int a = firstMissingPositive(aee);
        System.out.println(a);
    }
    public static int firstMissingPositive(int[] nums) {
        int len = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        for(int i=1;i<nums.length;i++){
            if(hm.containsKey(i)) continue;
            else return i;
        }
        return len;
    }
}
