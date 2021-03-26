"""
https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1
https://leetcode.com/problems/palindrome-linked-list/discuss/64500/11-lines-12-with-restore-O(n)-time-O(1)-space
"""
TC:O(n)
SC:O(1)
#Function to check whether the list is palindrome.

#Approach: Reversed first half == Second half?
def isPalindrome(head):
    
    slow = head
    fast = head
    
    #Part1 : Reverse the first half while finding the middle.
    #Initializing pointers for reversing the first half
    prev = None
    nxt = None
    while fast and fast.next:
        # fast traverses faster and moves to the end of the list if the length is odd
        fast = fast.next.next
        #Reversing part
        nxt = slow.next
        slow.next = prev
        prev = slow
        slow = nxt
    #If length of ll is odd,we have to increment slow to point to the second half
    #If length is odd,slow is already pointing to the second half
    if fast:
        slow = slow.next
    
    #Part2 : Comparing the elements of reversed first half and second half
    while prev and prev.data == slow.data:
        slow = slow.next
        prev = prev.next
    #If they are equal prev is None.Otherwise is some node
    return not prev
