package com.company.leetcode;

public class bs {
    public static void main(String[] args) {
       int[] arr = {-1,0,3,5,9,12};
        System.out.println(search(arr,9));
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = (start+end)/2;
            if(mid==target) return mid;
            else if(mid<target){
                start = mid+1;
            }
            else
                end = mid-1;
        }
        return -1;
    }
}
