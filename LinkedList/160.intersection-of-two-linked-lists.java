/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Direct way 
        // SC:1, TC: N + M
        
        ListNode p1 = headA;
        ListNode p2 = headB;

        while(p1 != p2){
            if(p1 == null) p1 = headB;
            else p1 = p1.next;
            if(p2 == null) p2 = headA;
            else p2 = p2.next;            
        }
        return p1;
       

    }
}
// @lc code=end

