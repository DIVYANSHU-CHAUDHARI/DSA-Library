"""
https://practice.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1#
"""

#TC:O(N)
#SC:O(1)
    def pairWiseSwap(self, head):
                # If list is empty or with one node
        if (head is None or
            head.next is None):
            return head
 
        # Initialize previous and current pointers
        prevNode = head
        currNode = head.next
 
        # Change head node
        head = currNode
 
        # Traverse the list
        #After every iteration elements pointed by curr and prev are aligned properly.
        while True:

            nextNode = currNode.next


            # Change next of current
            # node to previous node
            currNode.next = prevNode 
 
            # If next node is None.ie there is no next element(Happens when no. of elements in the linked list are even).point the pre node to None and break
            if nextNode is None:
                prevNode.next = None
                break
            # If next node is the last node,point the prev node to the last node and break
            elif nextNode.next is None:
                prevNode.next = nextNode
                break
            
            # Change next of previous to
            # next of next
            #If there is element after next element
            prevNode.next = nextNode.next
 
            # Update previous and current nodes
            #Both pointers jump 2 steps forward
            prevNode = nextNode
            currNode = prevNode.next
        return head
