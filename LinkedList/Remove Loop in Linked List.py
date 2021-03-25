"""
https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1#
"""
#Approach1:Check editorial Method 3
#TC:O(n)
#SC:O(1)
    #Function to remove a loop in the linked list.
    def removeLoop(self, head):
        if head is None or head.next is None:
            return head

        ptr1 = head
    	ptr2 = head
    	# Boolean to check if a loop exists in the given Linked List.
    	flag = False
    	# Traverse the Linked List.
    	while ptr2 and ptr2.next:
        	# Move ptr1 forward by one node.
        	ptr1 = ptr1.next
        	# Move ptr2 forward by two nodes.
        	ptr2 = ptr2.next.next
        	#Detecting circular linked list
        	if ptr1.next == head:
        	    ptr1.next = None
        	    return head
        	# Check if ptr1 and ptr2 meet at some node, then there is a loop in the Linked List and So make flag true and break.
        	if ptr1 == ptr2:
            	flag = True
            	break
        
    	# When there is a loop in the Linked List.
    	if flag:
        	# Assign head to ptr1.
        	ptr1 = head
        	# Loop until next of ptr1 and ptr2 are not equal.
        	while ptr1.next != ptr2.next:
            	ptr1 = ptr1.next
            	ptr2 = ptr2.next
            #When both pointers next are equal.That mean ptr2 has reached the last node.
        	# Make next of ptr2 i.e last node of Linked List None.
        	ptr2.next = None
    	return head
            
#Note:Exceeds time limit
#Approach2:
def removeLoop(self, head):
        if head == None or head.next == None:
            return None
        #Detect cycle
        slow = head
        fast = head.next
        
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            
            if slow == fast:
                loopnode = slow
                break
        #Finding no. of nodes in the loop
        ptr1 = loopnode
        ptr2 = loopnode
        loopCount = 0
        
        while ptr1.next!=ptr2:
            ptr1 = ptr1.next
            loopCount+=1
        #Set two pointers
        #One starting from head node
        #Other starting from loopCount nodes ahead of head node
        ptr1 = head
        ptr2 = head
        k = loopCount
        
        #Pointing ptr2 to k nodes ahead of head node
        while k>0:
            ptr2 = ptr2.next
            k-=1
        #Increment till they meet at the loop starting node
        while ptr1!=ptr2:
            ptr1=ptr1.next
            ptr2=ptr2.next
        #Increment ptr2 till the last node
        while ptr2.next!=ptr1:
            ptr2 = ptr2.next
        #Point ptr2.next to None
        ptr2.next = None
        
        return head
