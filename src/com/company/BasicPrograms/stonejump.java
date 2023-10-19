package com.company.BasicPrograms;

import java.util.Arrays;

public class stonejump {

        public static long maxCaloriesBurned(int[] stones) {
            // Sort the stones based on their heights in ascending order
            Arrays.sort(stones);

            long totalCalories = stones[stones.length-1]*stones[stones.length-1];
            int start=0;
            int end = stones.length-1;
            boolean flag = false;
            while (start<end){

                totalCalories += (stones[end]-stones[start])*(stones[end]-stones[start]);
                if(flag){
                    start++;
                    flag=false;
                }else {
                    end--;
                    flag=true;
                }
            }

            return totalCalories;
        }

        public static void main(String[] args) {
            int[] stones = {5, 4, 5, 4, 5};
            long maximumCalories = maxCaloriesBurned(stones);
            System.out.println("Maximum calories burned: " + maximumCalories);
        }

}
