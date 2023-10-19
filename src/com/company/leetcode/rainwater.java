package com.company.leetcode;

public class rainwater {
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        trap(arr);
    }
    public static int trap(int[] height) {
        int ans =0;
        for(int i=1;i<height.length-1;i++){
            int ptr = i-1;
            int ptrr = i+1;
            int l=0;
            int r=0;
            int min=0;
            int lvl=0;

            while(ptr>=0){
                if(height[i]>l) l=height[i];
                ptr--;
            }
            // System.out.print(l+"  ");
            while(ptrr<height.length){
                if(height[i]>r) r=height[i];
                ptrr++;
            }
            // System.out.print(r+"  ");
            //min = l<r?l:r;
            System.out.println(min);
            if(height[i]<min) lvl=min-height[i];
            ans+=lvl;
            System.out.print(lvl+"  ");
        }
        //System.out.println(ans);
        System.out.println();
        return ans;
    }
}
