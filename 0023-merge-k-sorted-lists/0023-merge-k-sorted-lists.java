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
    public ListNode mergeKLists(ListNode[] lists) {
        
       if(lists== null || lists.length ==0)
           return null;
        return mergeKListshelp(lists, 0, lists.length-1);
        
        
    }
    private ListNode mergeKListshelp(ListNode[] list, int s, int e)
    {

        if(s==e) return list[s];
        if(s == (e-1)) return mergetwoLists(list[s], list[e]);
        int n = s+ (e-s)/2;
        ListNode p, q;
        p= mergeKListshelp(list, s ,n);
        q = mergeKListshelp(list, n+1, e);
        return mergetwoLists(p,q);
        
    }
    private ListNode mergetwoLists(ListNode p, ListNode q)
    {
        
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;
        while(p!=null && q!=null)
        {
            if(p.val<q.val)
            {
                k.next= p;
                p=p.next;
            }
            else
            {
                k.next = q;
                q=q.next;
            }
            k = k.next;
            
        }
        if(p!=null)
        {
            k.next =p;
        }
        if (q!=null)
        {
            k.next = q;
        }
        return dummy.next;
    }
}