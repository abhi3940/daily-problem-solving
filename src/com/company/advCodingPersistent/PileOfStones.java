package com.company.advCodingPersistent;

public class PileOfStones {
    public static void main(String[] args) {
        int a=6,b=5,c=2,x=12,y=1;
        ps(a,b,c,x,y);
    }
    public static void ps(int a,int b,int c,int x,int y){
        if(a<=x&&c<=y&&b<=y){
            if(x-a+y-b==c){
                System.out.println("yes");
                return;
            }
            else if(x-a+y-c==b){
                System.out.println("yes");
                return;
            }
            else System.out.println("no no no");
        }else if(b<=x&&c<=y&&a<=y){
            if(x-b+y-a==c){
                System.out.println("yes");
                return;
            }
            else if(x-b+y-c==a){
                System.out.println("yes");
                return;
            }
            else System.out.println("no no no");
        }else if(c<=x&&a<=y&&b<=y){
            if(x-c+y-a==b){
                System.out.println("yes");
                return;
            }
            else if(x-c+y-b==a){
                System.out.println("yes");
                return;
            }
            else System.out.println("no no no");
        }
        else System.out.println("no no no");
    }
}
