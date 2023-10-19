package com.company.strings;

public class TomJerry {

        public static int maxConsecutiveSwimmingDays(String A, int K) {
            int ans =0;

            for (int i = 0; i < A.length(); i++) {
                int gap =K;
                int index = i;
                int cuAns=0;
                while(gap>=0&&index<A.length()){
                    if(A.charAt(index)=='0'&& gap==0) break;
                    if(A.charAt(index)=='1') cuAns++;
                    else{
                        cuAns+=gap;
                        index+=gap-1;
                        gap=0;
                    }
                    index++;

                }
                if(cuAns>ans) ans=cuAns;

            }
            return ans;
        }

        public static void main(String[] args) {
            String A = "100001";
            int K = 3;
            int result = maxConsecutiveSwimmingDays(A, K);
            System.out.println(result);  // Output: 6
        }

}
