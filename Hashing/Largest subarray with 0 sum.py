"""
https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1#
"""
#Approach1 - Brute force
"""
Time Complexity: O(n^2) due to the use of nested loops.
Space complexity: O(1) as no extra space is used.
"""

#Aprroach 2
def maxLen(n, arr):
    
    
    # NOTE: Dictonary in python in implemented as Hash Maps
    # Create an empty hash map (dictionary)
    hash_map = {}

    # Initialize result
    max_len = 0

    # Initialize sum of elements
    curr_sum = 0

    # Traverse through the given array
    for i in range(len(arr)):
        
        # Add the current element to the sum
        curr_sum += arr[i]

        if arr[i] is 0 and max_len is 0:
            max_len = 1

        if curr_sum is 0:
            max_len = i + 1

        # NOTE: 'in' operation in dictionary to search 
        # key takes O(1). Look if current sum is seen 
        # before
        if curr_sum in hash_map:
            max_len = max(max_len, i - hash_map[curr_sum] )
        else:

            # else put this sum in dictionary
            hash_map[curr_sum] = i

    return max_len
"""
  Complexity Analysis: 
Time Complexity: O(n), as use of good hashing function will allow insertion and retrieval operations in O(1) time.
Space Complexity: O(n), for the use of extra space to store the prefix array and hashmap.
"""
