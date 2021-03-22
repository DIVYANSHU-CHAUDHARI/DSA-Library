"""
https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1#
"""

#Approach 1

"""
Traverse the whole linked list and count the no. of nodes. Now traverse the list again till count/2 and return the node at count/2. 
"""

#Approach 2
#TC:O(n)
#SC:O(1)
def findMid(head):
    slow = head
    fast = head
    
    while fast and fast.next :
        slow = slow.next
        fast = fast.next.next
    return slow.data
