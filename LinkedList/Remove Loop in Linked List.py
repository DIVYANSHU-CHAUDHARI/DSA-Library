#Note:Exceeds time limit
#Approach1:
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
