"""
https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1
"""
  #My solution
  #TC:O(n)
  #SC:O(1)
  #Function to rotate a linked list.
    def rotate(self, head, k):
        if head is None or head.next is None:
            return head
        tmp = head
        end = head
        while k-1>0:
            tmp = tmp.next
            k-=1
        #tmp points to the last element of the linkedlist to be rotated
        while end.next:
            end = end.next
        if k>0:
            end.next = head
            head = tmp.next
            tmp.next = None
        
        return head

#Approach2: Using circular Linked List
"""
To rotate a linked list by k, 
we can first make the linked list circular and then moving k-1 steps forward from head node, making it null and make kth node as head.
"""
#TC:O(n)
#SC:O(1)
#Using circular LinkedList
def rotate(self, head, k):
        if k == 0 or head == None or head.next == None:
            return head
        curr = head
        while curr.next:
            curr = curr.next
        curr.next = head
        curr = head
        
        while k-1>0:
            curr = curr.next
            k-=1
        head = curr.next
        curr.next = None
        
        return head
        
