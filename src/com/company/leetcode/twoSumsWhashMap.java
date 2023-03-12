package com.company.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class twoSumsWhashMap {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int[] ans = twoSum(nums,6);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target && map.containsKey(0)){
                arr[0] = i;
                arr[1] = map.get(0);
                return arr;
            }
            if(map.containsKey(target-nums[i])){
                arr[0] = i;
                arr[1] = map.get(target-nums[i]);
                return arr;
            }
        }
        return arr;
    }
}
