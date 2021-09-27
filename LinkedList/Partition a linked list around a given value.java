//https://leetcode.com/problems/partition-list/
//https://www.youtube.com/watch?v=K5AVJVjdmL0
//TC:O(n)
//SC:O(n)

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode node = head;
        ListNode beforeDummy  = new ListNode(-1);
        ListNode afterDummy = new ListNode(-1);
        ListNode before= beforeDummy;
        ListNode after = afterDummy;
        while(node!=null){
            if(node.val<x){
                before.next = node;
                before = before.next;
            }else{
                after.next = node;
                after= after.next;
            }
            node = node.next;
        }
        after.next = null;
        before.next = afterDummy.next;
        return beforeDummy.next;
    }
}
