  """
  https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1#
  """
  
  
#Approach1 : Three pointer method
#TC:O(n)
#SC:O(1)
  
  def reverseList(self, head):
        prev = None
        curr = head
        
        while curr:
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        head = prev
        return head
    
#Approach2 : Recursively
#TC:O(n)
#SC:O(n)

    def reverseList(self, head):
        
        #Base condition
        if head is None or head.next is None:
            return head
        #head is None condition for Null input
        rest = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        
        return rest
#Approach 3:Using stack
 
  def reverseList(self, head):
        if head is None or head.next is None:
            return head
        temp,stack = head,[]
        
        #Append all nodes in stack
        while temp:
            stack.append(temp)
            temp = temp.next
        
        temp = head = stack.pop()
        #pop all the nodes and reverse the ordering
        while len(stack)>0:
            elem = stack.pop()
            temp.next = elem
            temp = elem
        
        elem.next = None
        return head
