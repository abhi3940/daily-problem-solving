package com.company.arrays;

import java.util.ArrayList;
import java.util.List;

public class folder {
    public static void main(String[] args) {
        ArrayList<String> st = new ArrayList<>();
        st.add("o/");
        st.add("w/");
        st.add("e/");
        st.add("./");
        st.add("./");
        st.add("./");

        System.out.println(solv(st));
    }
    static int solv(List<String> loggedMoves){
        int ans =0;
        for (int i = 0; i < loggedMoves.size(); i++) {
            if(loggedMoves.get(i)=="../") ans--;
            else if(loggedMoves.get(i)=="./") continue;
            else ans++;
        }
        return ans;
    }
}
