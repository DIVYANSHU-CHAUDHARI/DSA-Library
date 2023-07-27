//Difference method of linked lists
LC: https://leetcode.com/problems/intersection-of-two-linked-lists/description/
solution: https://www.youtube.com/watch?v=8CACsqPWpHo

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;
        int lA = 0, lB = 0;
        int difference = 0;

        while (ptr1!=null) {
            ptr1 = ptr1.next;
            lA+=1;
        }
        while (ptr2!=null) {
            ptr2 = ptr2.next;
            lB+=1;
        }

        if (lA > lB) {
            difference = lA - lB;
        } else {
            difference = lB - lA;
        }
        ptr1 = headA;
        ptr2 = headB;

         if (lA > lB) {
            for (int i=0;i<difference;i++) {
                ptr1 = ptr1.next;
            }
        } else {
           for (int i=0;i<difference;i++) {
                ptr2 = ptr2.next;
            }
        }

        while (ptr1 != ptr2 && ptr1!=null && ptr2!=null ) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        if (ptr1 == ptr2) return ptr1;

        return null;
    }
}

// TC : O(m+n)
// SC: O(1)
