// Iterative solution

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

// Recursive solution

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        // reverseList reverses the LL starting from the node that is passed and returns the head of the reversed LL
        ListNode reversedList = reverseList(head.next);
        // Attach the current node with the reversed part in reverse manner link.
        head.next.next = head;
        head.next = null;
        return reversedList;
    }
}
