"""
https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
"""
  
  #Function to check if the linked list has a loop
    #TC:O(n)
    #SC:O(1)
    #Two pointer approach 
    
    def detectLoop(self, head):
        if head is None:
            return False
        slow = head
        fast = head.next
        #if the Linked List has a cycle fast and slow
        #will meet at some point
        while slow!=fast:
            if fast is None or fast.next is None:
                return False
            slow=slow.next
            fast = fast.next.next
        return True
