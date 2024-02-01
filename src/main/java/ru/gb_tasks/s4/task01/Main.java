package ru.gb_tasks.s4.task01;

public class Main {
    public static void main(String[] args) {

    }

    /**
     * Definition for singly-linked list.
     * struct ListNode {
     *     int val;
     *     ListNode *next;
     *     ListNode() : val(0), next(nullptr) {}
     *     ListNode(int x) : val(x), next(nullptr) {}
     *     ListNode(int x, ListNode *next) : val(x), next(next) {}
     * };
     */
    /*class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode n1 = null;
            ListNode current = head;
            while(current!=null){
                ListNode n2 = current.next;
                current.next = n1;
                n1= current;
                current = n2;
            }
            return n1;
        }
    }*/
}
