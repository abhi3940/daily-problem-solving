package com.company.leetcode;

import java.util.LinkedList;
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }
public class MidOfList {

    public static void main(String[] args) {

    }
    public static ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode current = head;
        ListNode temp = head;
        while(temp!=null)
            temp = temp.next;
        count++;

        int mid = count/2+1;

        for(int i=1;i<mid;i++){
            current = current.next;
        }
        return current;
    }
}
