"""
https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1#
"""
"""
Variation of this question : https://leetcode.com/problems/add-two-numbers/
"""
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
