/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // HashSet
        // TC: N, SC: N

        Set<ListNode> set = new HashSet<>();
    
        
        while(head != null){
            if(set.contains(head)) return true;
            set.add(head);
            head= head.next;
        }
        return false;
    }
}
// @lc code=end

