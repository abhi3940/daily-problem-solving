package com.company.advCodingPersistent;

import java.util.HashSet;

public class UniqueDishesh {
    public static void main(String[] args) {
        int[] a ={1,2,1,2,2,1,2,3,2,4};
        int s =ud(a);
        System.out.println(s);
    }
    public static int ud(int[] arr){
        int ans =0,md=0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        Integer[] ue = hs.toArray(new Integer[hs.size()]);
        for (int i = 0; i < hs.size(); i++) {
            int cd = 0;
            boolean ps = false;
            for (int j = 0; j < arr.length; j++) {
                if(ue[i]==arr[j]){
                    if(ps) ps=false;
                    else{
                        cd++;
                        ps=true;
                    }
                }

            }
            if(md<cd){
                md = cd;
                ans = ue[i];
            }else if(md==cd) ans = ans<ue[i]?ans:ue[i];

        }
        return ans;
    }
}
