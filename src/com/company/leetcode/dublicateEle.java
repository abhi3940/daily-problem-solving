package com.company.leetcode;

import java.util.Arrays;

public class dublicateEle {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int count =0;
        int len = nums.length;
        for(int i=1;i<len;i++){
            if(nums[i-1]==nums[i]){
                sendBack(nums,i-1);
                count++;
                len --;
                if(i>1)
                    i--;
            }
        }
        int ans = nums.length-count;
        System.out.println(ans);
        System.out.println(Arrays.toString(nums));
    }

    static int[] sendBack(int[] arr,int e){
        int temp = arr[e];
        int len = arr.length;
        for(int i=e;i<len-1;i++){
            arr[i]=arr[i+1];
        }
        arr[len-1]=temp;
        return arr;
    }
}

