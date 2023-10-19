package com.company.BasicPrograms;

public class party {
    public static void main(String[] args) {
        int N = 3;
        int M = 4;
        int X = 1;
        int[] friendsRates = {1,1,1};

        int[] times = biryaniTime(N, M, X, friendsRates);

        System.out.println("Time needed for friends only: " + times[0] + " hours");
        System.out.println("Time needed with Ninja: " + times[1] + " hours");
    }
    public static int[] biryaniTime(int N, int M, int X, int[] friendsRates) {
        int totalFriendsRate = 0;

        for (int rate : friendsRates) {
            totalFriendsRate += rate;
        }

        int totalRateWithNinja = totalFriendsRate + X;
        double timeWithoutNinja = (double) M / totalFriendsRate;
        double timeWithNinja = (double) M / totalRateWithNinja;

        int[] result = { (int) Math.ceil(timeWithoutNinja), (int) Math.ceil(timeWithNinja) };

        return result;
    }
}
