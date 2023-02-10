package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class validParanthisis {
    public static void main(String[] args) {


    }
    static boolean isValid(String s){
        Stack<Character> p = new Stack<Character>();
        for (int i = 0; i < s.length(); i++)
            switch (s.charAt(i)) {
                case '(': p.push(')'); break;
                case '{': p.push('}'); break;
                case '[': p.push(']'); break;
                case ')': case '}': case ']': if (p.isEmpty() || p.pop() != s.charAt(i)) return false;
            }
        return p.isEmpty();
    }
    }


