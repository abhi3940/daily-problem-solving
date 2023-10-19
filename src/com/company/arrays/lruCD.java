package com.company.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class lruCD {
    static int findCD(int cD[], int n, int capacity)
    {
        HashSet<Integer> s = new HashSet<>(capacity);
        HashMap<Integer, Integer> indexes = new HashMap<>();
        int page_faults = 0;
        for (int i=0; i<n; i++)
        {
            if (s.size() < capacity) {
                if (!s.contains(cD[i])) {
                    s.add(cD[i]);
                    page_faults++;
                }
                indexes.put(cD[i], i);
            }
                 else
                {
                    if (!s.contains(cD[i]))
                    {
                        int lru = Integer.MAX_VALUE, val=Integer.MIN_VALUE;
                        Iterator<Integer> itr = s.iterator();
                        while (itr.hasNext()) {
                            int temp = itr.next();
                            if (indexes.get(temp) < lru)
                            {
                                lru = indexes.get(temp);
                                val = temp;
                            }
                        }

                        s.remove(val);
                        indexes.remove(val);
                        s.add(cD[i]);
                        page_faults++;
                    }
                    indexes.put(cD[i], i);
                }
            }

            return page_faults;
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int CDSize = scanner.nextInt();
        int[] CDRequests = new int[CDSize];
        for (int i = 0; i < CDSize; i++) {
            CDRequests[i] = scanner.nextInt();
        }
        int size = scanner.nextInt();

        int unfulfilledRequests = findCD(CDRequests,CDSize, size);
        System.out.println("Number of unfulfilled CD requests: " + unfulfilledRequests);
    }
}

