package com.company.daa;

public class ksdpsmall {


        static int knapSack(int W, int wt[], int val[], int n)
        {
            // making and initializing dp array
            int []dp = new int[W + 1];


            for (int i = 1; i < n + 1; i++) {
                for (int w = W; w >= 0; w--) {

                    if (wt[i - 1] <= w)

                        // finding the maximum value
                        dp[w] = Math.max(dp[w],
                                dp[w - wt[i - 1]] + val[i - 1]);
                }
            }
            return dp[W]; // returning the maximum value of knapsack
        }

        // Driver code
        public static void main(String[] args)
        {
            int val[] = { 60, 100, 120 };
            int wt[] = { 10, 20, 30 };
            int W = 50;
            int n = val.length;
             int a = knapSack(W, wt, val, n);
            System.out.println(a);
        }
    }

// This code is contributed by gauravrajput1



