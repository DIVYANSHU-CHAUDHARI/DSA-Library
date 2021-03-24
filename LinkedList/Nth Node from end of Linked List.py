Approach1 : Calculating lengths
TC:O(n)
SC:O(1)
#Function to find the data of nth node from the end of a linked list
def getNthFromLast(head,n):
    while head is None :
        return None
    length = 0
    temp = head
    x = -1
    while temp:
        length+=1
        temp = temp.next
    noForwardSteps = length - n
    temp = head
    k = noForwardSteps
    while k>0:
        temp = temp.next
        k-=1
    if noForwardSteps>=0:
        return temp.data
    return -1
  
Approach2 : Two pointers
TC:O(n)
SC:O(1)
  
  def getNthFromLast(head,n):
    while head is None :
        return None
    length = 0
    temp = head
    #Calculating length
    while temp:
        temp = temp.next
        length+=1
    if n>length:
        return -1
    ptr1 = head
    ptr2 = head
    while n-1>0:
        ptr2 = ptr2.next
        n-=1
    while ptr2.next:
        ptr1 = ptr1.next
        ptr2 = ptr2.next
    return ptr1.data
