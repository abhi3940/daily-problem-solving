package com.company.BasicPrograms;

import java.util.Scanner;

public class burgir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i <=n; i++) {
            if((n-i)*y + i*x <= r){
                System.out.println(n-i);
                System.out.println(i);
            }
        }
        if(n*x>=r){
            System.out.println("not possible");
        }

    }
}
