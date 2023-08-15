# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def partition(self, head: Optional[ListNode], x: int) -> Optional[ListNode]:
        p=head
        st=[]
        st1=[]
        dummy=ListNode(-1)
        k=dummy
        
        while(p):
            if p.val<x:
                st.append(p)
            else:
                st1.append(p)
            p=p.next
        while(st):
            k.next=st.pop(0)
            k=k.next
        while(st1):
            k.next=st1.pop(0)
            k=k.next
        k.next=None
        return dummy.next
        