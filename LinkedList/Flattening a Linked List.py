"""
https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1#
"""
#Approach1:Recursive approach to merge both lists
#This soltuion is more efficient than iterative according to gfg.
#TC:O(N) where N total no. of nodes
#SC:O(1)
def flatten(root):
    #Recur till the rightmost list
    if root is None or root.next is None:
        return root
        
    root.next = flatten(root.next)
    root = mergeTwoLists(root,root.next)
    
    return root
  
#Function to merge two lists and return the root using recursion
def mergeTwoLists(a,b):
    #base cases
    if a is None:return b
    if b is None:return a
    
    temp = None
    if a.data<=b.data:
        temp = a
        temp.bottom = mergeTwoLists(a.bottom,b)
    else:
        temp = b
        temp.bottom = mergeTwoLists(a,b.bottom)
    return temp
        
-------------------------------------------------------------------------
Approach2 : Iteratve approach to merge two lists
  
def flatten(root):
    #Recur till the rightmost list
    if root is None or root.next is None:
        return root
        
    root.next = flatten(root.next)
    root = mergeTwoLists(root,root.next)
    
    return root

#Iterative approach to merge two lists
def mergeTwoLists(a,b)
    dummy = Node(0)
    temp = dummy
    while a and b:
        if a.data<=b.data:
            temp.next = a
            temp = temp.bottom
            a = a.bottom
        else:
            temp.bottom = b
            temp = temp.bottom
            b = b.bottom
    if a is None:temp.bottom = b
    else:temp.bottom = a
    return dummy.bottom
    
    
   
