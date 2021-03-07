"""
https://practice.geeksforgeeks.org/problems/relative-sorting4323/1
"""
"""
Method 3 (Use Hashing) 

Loop through A1[], store the count of every number in a HashMap (key: number, value: count of number)
Loop through A2[], check if it is present in HashMap, if so, put in output array that many times and remove the number from HashMap.
Sort the rest of the numbers present in HashMap and put in the output array.
from collections import Counter
"""

# Function to sort arr1 
# according to arr2
def solve(arr1, arr2):
    # Our output array
    res = []
    
    # Counting Frequency of each
    # number in arr1
    f = Counter(arr1)
    
    # Iterate over arr2 and append all 
    # occurences of element of
    # arr2 from arr1
    for e in arr2:
      
        # Appending element 'e', 
        # f[e] number of times
        res.extend([e]*f[e])
        
        # Count of 'e' after appending is zero
        f[e] = 0
        
    # Remaining numbers in arr1 in sorted 
