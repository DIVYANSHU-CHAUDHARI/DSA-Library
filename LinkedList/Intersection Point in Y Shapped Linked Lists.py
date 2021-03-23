"""
https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1/#
"""
#Most code efficient
#TC:O(m+n)
#SC:O(1)

#2 pointer technique

def intersetPoint(head1,head2):
    if head1 is None or head2 is None:
        return None
    #Initialize pointers
    temp1 = head1
    temp2 = head2
    flag = 0
    #Redirect temp1 to head2 if temp1 reaches end of list and similar for temp2
    #Now,we can start comparing as both are equidistant from collision point
    while temp1!=temp2:
        temp1 = head2 if temp1 is None else temp1.next
        temp2 = head1 if temp2 is None else temp2.next
    #if both reach end return -1 else return intersection point node value
    return -1 if temp1 is None else temp1.data
 

#Difference of node counts method

#TC:O(m+n)
#SC:O(1)
def intersetPoint(head1,head2):
    if head1 is None or head2 is None:
        return None
    temp1,temp2 = head1,head2
    len1,len2 = 0,0
    #length of list1
    while temp1:
        len1+=1
        temp1=temp1.next
    #Length of list2
    while temp2:
        len2+=1
        temp2 = temp2.next
    #absolute difference of lengths
    diff = abs(len2-len1)
    #Adjusting head pointer of longer length list before comparison
    if len1>len2:
        while diff>0:
            head1=head1.next
            diff-=1
    elif len1<len2:
        while diff>0:
            head2=head2.next
            diff-=1
    temp1 = head1
    temp2 = head2
    #Comparing next pointers of every node from adjusted lengths
    while temp1 and temp2:
        if temp1.next == temp2.next:
            return temp1.next.data
        else:
            temp1=temp1.next
            temp2 =temp2.next
    return -1
