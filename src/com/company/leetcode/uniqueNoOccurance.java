package com.company.leetcode;

import java.util.HashMap;

public class uniqueNoOccurance {
    public static void main(String[] args) {
        int[] a ={1,2,2,1,1,3};
        boolean c = uniqueOccurrences(a);
        System.out.println(c);
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hs.containsKey(arr[i])) hs.put(arr[i],hs.get(arr[i])+1);
            else hs.put(arr[i],0);
        }
        for(int i=0;i<arr.length-1;i++){
            if(hs.get(arr[i])==hs.get(arr[i+1])) return false;
        }
        return true;
    }
}
