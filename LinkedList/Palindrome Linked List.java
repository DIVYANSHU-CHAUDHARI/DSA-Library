// Reversed second half = first half

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        //get the middle of the LL
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode temp = head;
        int length = 0;

        //calculate the length of the LL
        while (temp!=null) {
            length+=1;
            temp = temp.next;
        }

        if (length%2==1) {
            slow = slow.next;
        }

        ListNode curr = slow;
        ListNode prev = null;
        ListNode nex = null;
        while (curr!=null) {
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }

    ListNode ptr1 = prev;
    ListNode ptr2 = head;
    int limit = length/2;

    for (int i=0;i<limit;i++) { 
        if (ptr1!=null && ptr2!=null && ptr1.val != ptr2.val) {
            return false;
        }
        ptr1 = ptr1.next;
        ptr2 = ptr2.next;
    }
    return true;
    }
}
