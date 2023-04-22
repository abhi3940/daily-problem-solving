package com.company.leetcode;

public class rotetedArraySearch {
    public static void main(String[] args) {
        int[] nums ={1,3};
        System.out.println(search(nums,3));
    }
    static int search(int[] nums, int target) {
        int rp=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]) rp=i+1;
        }
        System.out.println(rp);
        if(rp==0) return bsearch(nums,0,nums.length-1,target);
        int a = bsearch(nums,0,rp,target);
        int b = bsearch(nums,rp,nums.length-1,target);

        return a>b?a:b;
    }
    static int bsearch(int[] nums, int s, int e, int target){
        int mid = s+(e-s)/2;
        System.out.println(mid);
        if(s>e) return -1;
        if(nums[mid]==target) return mid;
        else if(nums[mid]<target) return bsearch(nums,s,mid-1,target);
        else return bsearch(nums,mid+1,e,target);
    }
}
