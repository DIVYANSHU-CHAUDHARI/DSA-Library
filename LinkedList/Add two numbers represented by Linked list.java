"""
https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1#
"""
"""
Variation of this question : https://leetcode.com/problems/add-two-numbers/
"""
//Leetcode solution..The nos are already in reversed order and the answer is also expected in reverse order.
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0;
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(ptr1!=null || ptr2!=null || carry!=0){
            int n1= ptr1!=null?ptr1.val:0;
            int n2 = ptr2!=null?ptr2.val:0;
            sum = (n1+n2+carry)%10;
            carry = (n1+n2+carry)/10;
            ListNode newNode  = new ListNode(sum);
            curr.next = newNode;
            curr = curr.next;
            if(ptr1!=null)ptr1 = ptr1.next;
            if(ptr2!=null)ptr2 = ptr2.next;
        }
        return dummy.next;
    }
}

#Function to add two numbers represented by linked list.
    def reverseList(self,head):
        prev = None
        curr = head
        nxt = None
        
        while curr:
            nxt = curr.next
            curr.next = prev
            prev = curr
            curr = nxt
        return prev
    
    
    def addTwoLists(self, first, second):
        first = self.reverseList(first)
        second = self.reverseList(second)
        k = root = Node(0)
        carry = 0
        while first or second or carry:
            v1 = v2 = 0
            if first:
                v1 = first.data
                first = first.next
            if second:
                v2 = second.data
                second = second.next
            carry,val = divmod(v1+v2+carry,10)
            k.next = Node(val)
            k = k.next
        result = self.reverseList(root.next)
        return result
