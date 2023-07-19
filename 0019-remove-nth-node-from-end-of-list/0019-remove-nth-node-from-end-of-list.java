/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) { 
        int cnt =1;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
            
        ListNode p = dummy;
        ListNode q = dummy;
        while(cnt<=n)
        {
          p = p.next;
          cnt+=1;
            
        }
        while(p!=null && p.next!=null)
        {
            
            p = p.next;
            q = q.next;
        }
       if (q.next!=null)
       {
        q.next = q.next.next;
        }
        return dummy.next;
        
    }
}