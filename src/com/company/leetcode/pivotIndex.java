package com.company.leetcode;

public class pivotIndex {
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        pivotIndex(arr);
    }
    public static int pivotIndex(int[] nums) {

        for(int i=0;i<nums.length;i++){
            int leftSum= 0;
            int rightSum= 0;
            for(int j=0;j<i;j++){
                leftSum += nums[j];
            }
            for(int j=i;j<nums.length;j++){
                rightSum += nums[j];
            }
            if(leftSum == rightSum)
                return i;
        }
        return -1;
    }
}
