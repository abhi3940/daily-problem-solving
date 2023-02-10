package com.company.daa;

import java.util.*;


public class knapsack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of element");
        int n = in.nextInt();

        int maxW = 20;
        float[] w = new float[n+1];
        float[] v = new float[n+1];
        float[] ratio = new float[n+1];
        float[] temp = new float[n+1];

        for (int i = 0; i < n; i++) {
            System.out.println("enter weight of "+(i+1) +"th element");

            w[i] = in.nextInt();
            System.out.println("enter profit of "+(i+1) +"th element");

            v[i] = in.nextInt();

            ratio[i] = v[i]/w[i];
            temp[i] = ratio[i];
        }

        Arrays.sort(temp);
        reverse(temp);
        float ttlW=0;
        float ttlP = 0;

        for (int i = 0; i < n; i++) {

            if(ttlW == maxW){
                break;
            }
            else if(ttlW<maxW){
                ttlW = ttlW + getEl(temp[i],ratio,w);
                ttlP = ttlP + getEl(temp[i],ratio,v);
            }
            else if(ttlW>maxW){
                ttlW = ttlW - getEl(temp[i],ratio,w);
                ttlP = ttlP - getEl(temp[i],ratio,v);
                // getting how much weight is remaining
                float rmW = maxW - ttlW;
                ttlP = ttlP + rmW*temp[i];
            }


        }

        System.out.println(Arrays.toString(w));
        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.toString(ratio));
        System.out.println(Arrays.toString(temp));
        System.out.println(ttlW);
        System.out.println(ttlP);

    }
    static float getEl(float n,float[] ratio,float[] arr){
        int s = Arrays.binarySearch(ratio,n);
        return arr[s];

    }
    static void reverse(float a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }

}

//        HashMap<Integer,Integer> hm = new HashMap<>();
//        for (int j = 0; j < n; j++) {
//            int r = v[j]/w[j];
//            hm.put(w[j],r);
//
//        }

