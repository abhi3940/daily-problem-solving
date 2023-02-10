package com.company.Function;

public class PythogonianTriplate {
    public static void main(String[] args) {
        System.out.println(isPT(3,9,5));
    }
    static boolean isPT(int a,int b,int c){
        if(a*a == b*b + c*c)
            return true;
        else if(b*b == a*a +c*c)
            return true;
        else if(c*c == a*a + b*b)
            return true;
        else
            return false;
    }
}
