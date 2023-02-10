package com.company.recursion;

public class DigitalRootsWithLoop {
    public static void main(String[] args) {
        int n = 5457;
        int ans = 0;

        while (true){
            while (n>0){
                ans = ans + n%10;
                n = n/10;
            }
            if(ans<10){
                System.out.println(ans);
                break;
            }else{
                n = ans;
                ans = 0;
            }
        }
    }
}
