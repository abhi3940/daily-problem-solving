package com.company.daa;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class smplKS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of objects");
        int n = in.nextInt();
        int[] w = new int[n];
        int [] p = new int[n];
        System.out.println("enter max wt");
        int maxW = in.nextInt();
        int ttlW = 0;
        float ttlp = 0;
        float[] ratio = new float[n];
        float[] temp = new float[n];



        for (int i = 0; i < n; i++) {
            System.out.println("enter weight of "+(i+1) +"th element");

            w[i] = in.nextInt();
            System.out.println("enter profit of "+(i+1) +"th element");

            p[i] = in.nextInt();

            ratio[i] = p[i]/w[i];
            temp[i] = ratio[i];
        }

        for (int i = 0; i < n ; i++) {
            ratio[i] = (float)p[i]/(float)w[i];
            temp[i] = ratio[i];
        }
        Arrays.sort(temp);
        rever(temp);

        for (int i = 0; i < n; i++) {
            if(maxW == ttlW){

                break;
            }
            else if(maxW>= ttlW + getEl(temp[i],ratio,w) ){
                ttlW = ttlW + getEl(temp[i],ratio,w);
                ttlp = ttlp + getEl(temp[i],ratio,p);
            }
            else if(maxW<= ttlW + getEl(temp[i],ratio,w)){
                int remW = maxW - ttlW;
                ttlW = maxW;
                ttlp = ttlp + remW*temp[i];
            }
        }


        System.out.println(Arrays.toString(w));
        System.out.println(Arrays.toString(p));
        System.out.println(Arrays.toString(ratio));
        System.out.println(Arrays.toString(temp));
        System.out.println("max profit is "+ ttlp);
    }

    static float[] rever(float[] array){
        for(int i=0; i<array.length/2; i++){
            float temp = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = temp;
        }
        return array;
    }
    static int getEl(float ni,float[] ratio,int[] arr){

        int s = findIndex(ratio,ni);
        return arr[s];

    }

    public static int findIndex(float arr[], float t)
    {

        // if array is Null
        if (arr == null) {
            return -1;
        }

        // find length of array
        int len = arr.length;
        int i = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }




}
