'''
https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1#
'''

'''
Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. 
Task is to check whether a2[] is a subset of a1[] or not. Both the arrays can be sorted or unsorted. 
It may be assumed that elements in both array are distinct.
'''
def isSubset( a1, a2, n, m):
    a1 = set(a1)
    for ele in a2:
        if ele not in a1:
            return 'No'
    return 'Yes'
