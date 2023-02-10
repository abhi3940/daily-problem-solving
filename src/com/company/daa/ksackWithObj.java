package com.company.daa;

import java.util.Arrays;
import java.util.Comparator;

public class ksackWithObj {
    public static void main(String[] args) {


        object ob1 = new object(50, 10);
        object ob2 = new object(100, 5);
        object ob3 = new object(80, 8);
        object ob4 = new object(20, 2);
        object ob5 = new object(50, 5);

        object[] rat = {ob1, ob2, ob3, ob4, ob5};
        //Arrays.sort(rat);
        System.out.println("--- before");
        System.out.println(Arrays.asList(rat));
       // Arrays.sort(rat, (a, b) -> a.ratio.compareTo(b.ratio));
        System.out.println("--- after");
        System.out.println(Arrays.asList(rat));


    }
    public int compareTo(object o) {
        // usually toString should not be used,
        // instead one of the attributes or more in a comparator chain
        return toString().compareTo(o.toString());
    }
//    static void pick(int[] rat , int maxWeight){
//        int totalWeight =
//        if(maxWeight>)
//    }
}


class object{
    int profit;
    int weight;
    int ratio;

    object(int profit,int weight ){
        this.profit = profit;
        this.weight = weight;
        ratio = profit/weight;
    }
}
