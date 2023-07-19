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
    public void reorderList(ListNode head) {
        ListNode s = head, f = head;
        if(head == null || head.next ==null) return ;
        ListNode piche = null;
        while(f!=null && f.next!=null)
        {
            piche = s;
            s= s.next;
            f=f.next.next;
            
        }
    
        piche.next = null;
        ListNode prev = null;
        ListNode n;
        while(s!=null )
        {
            n = s.next;
            s.next = prev;
            prev = s;
            s= n;
            
        }
        ListNode k = head;
        ListNode  k1, pr1;
        while(k!=null && prev!=null )
        {
            k1 = k.next;
            k.next= prev;
            pr1= prev.next;
            if (k1!=null)
                prev.next = k1;
            k = k1;
            prev = pr1;
        }
       
        
        
    }
}