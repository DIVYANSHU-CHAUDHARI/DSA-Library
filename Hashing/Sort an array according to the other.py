"""
https://practice.geeksforgeeks.org/problems/relative-sorting4323/1
"""
"""
Method 3 (Use Hashing) 

1.Loop through A1[], store the count of every number in a HashMap (key: number, value: count of number)
2.Loop through A2[], check if it is present in HashMap, if so, put in output array that many times and remove the number from HashMap.
3.Sort the rest of the numbers present in HashMap and put in the output array.
"""
from collections import Counter


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

       
    #My solution
    '''
    https://practice.geeksforgeeks.org/problems/relative-sorting4323/1#
    '''
        #Function to sort an array according to the other array.
    def relativeSort (self,A1, N, A2, M):
        #Counter dictionary for keeping count of every integer
        cntDictA1 = Counter(A1)
        #modifying A2 to remove duplicates + maintaining order
        newA2 = sorted(set(A2),key = A2.index)
        result = []
        #List of elements in A1 but not in A2
        remaining = []
        for element in newA2:
            if element in A1:
                result.extend([element]*cntDictA1[element])
        for element in A1:
            if element not in result:
                remaining.append(element)
        #Remaining elements should be appended in sorted manner
        remaining = sorted(remaining)
        result.extend(remaining)
        return result
