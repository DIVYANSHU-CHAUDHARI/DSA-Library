"""
https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1#
"""
#TC:O(n+m)
#SC : O(n+m)
# Function to merge two sorted linked list.
def mergeLists(head1, head2):

    # create a temp node NULL
    temp = None

    # List1 is empty then return List2
    if head1 is None:
        return head2

    # if List2 is empty then return List1
    if head2 is None:
        return head1

    # If List1's data is smaller or
    # equal to List2's data
    if head1.data <= head2.data:

        # assign temp to List1's data
        temp = head1

        # Again check List1's data is smaller or equal List2's 
        # data and call mergeLists function.
        temp.next = mergeLists(head1.next, head2)
        
    else:
        # If List2's data is greater than or equal List1's 
        # data assign temp to head2
        temp = head2

        # Again check List2's data is greater or equal List's
        # data and call mergeLists function.
        temp.next = mergeLists(head1, head2.next)

    # return the temp list.
    return temp
