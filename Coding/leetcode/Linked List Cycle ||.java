/** ----------------------- Question: https://leetcode.com/problems/linked-list-cycle-ii/ ---------------------------------
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
    public ListNode detectCycle(ListNode head) {
        ListNode slow;
        ListNode fast;
        slow = fast = head;
        while(fast!=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                slow = head;
                while(slow != fast) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        
        return null;
    }
}

/*Success
Details 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle II.
Memory Usage: 39.2 MB, less than 67.35% of Java online submissions for Linked List Cycle II.
*/
