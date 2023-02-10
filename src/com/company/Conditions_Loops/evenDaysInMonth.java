package com.company.Conditions_Loops;

import java.util.Scanner;

public class evenDaysInMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of month");
        int choise = input.nextInt();
       if(choise == 2){
           System.out.println(14);
       }
       else if(choise<1||choise>12){
           System.out.println("incorrect input");
       }
       else
           System.out.println(15);
    }

}
