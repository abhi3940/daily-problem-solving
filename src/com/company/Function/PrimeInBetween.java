package com.company.Function;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeInBetween {
    public static void main(String[] args) {
        System.out.println((prime(2,13)));
    }
    static ArrayList<Integer> prime(int a, int b){
        ArrayList<Integer> ans= new ArrayList<>();
        for (int i = a; i <= b; i++) {
            for (int j = 2; j < i; j++) {
                if(i%j == 0){
                    break;
                }else{
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}
