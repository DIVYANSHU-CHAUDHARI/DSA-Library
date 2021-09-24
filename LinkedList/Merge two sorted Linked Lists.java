//https://leetcode.com/problems/merge-two-sorted-lists/
   
// TC: O(n+m)
// SC: O(n+m)

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode dummy = dummyNode;
        ListNode prev = dummy;
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        while(ptr1!=null && ptr2!=null){
            if(ptr1.val<ptr2.val){
                prev.next = ptr1;
                ptr1=ptr1.next;
            }else{
                prev.next = ptr2;
                ptr2 = ptr2.next;
            }
            prev = prev.next;
        }
        prev.next = ptr1!=null?ptr1:ptr2;        
        return dummy.next;
        
        
    }
}
