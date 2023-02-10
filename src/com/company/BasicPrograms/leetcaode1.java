package com.company.BasicPrograms;

import java.util.Arrays;

public class leetcaode1 {
    //https://leetcode.com/problems/two-sum/

    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target = 9;

        for(int i=0; i< nums.length-1; i++){
            for(int j=i+1; j< nums.length; j++){
                if(nums[i]+nums[j] == target){
                    int[] ans = {i,j};
                    System.out.println(Arrays.toString(ans));
                }

            }

        }
    }
}
