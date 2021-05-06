'''
https://practice.geeksforgeeks.org/problems/zero-sum-subarrays1825/1#
https://www.youtube.com/watch?v=C9-n_H7dsvU

Maintain sum of elements encountered so far in a variable (say sum).
If current sum is 0, we found a subarray starting from index 0 and ending at index current index
Check if current sum exists in the hash table or not.
If current sum already exists in the hash table then it indicates that this sum was the sum of some sub-array elements arr[0]…arr[i] and now the same sum is obtained for the current sub-array arr[0]…arr[j] which means that the sum of the sub-array arr[i+1]…arr[j] must be 0.
Insert current sum into the hash table
'''
#TC:O(n)
#SC:O(n) due to dictionary
    def findSubArrays(self,arr,n):
        currsum = 0
        #Tracking current sum for every every element added
        hashmap = {}
        #Stores sum->frequency of that sum
        count = 0
        for i in range(n):
            currsum+=arr[i]
            if currsum == 0:
                    count+=1
            if currsum not in hashmap:
                hashmap[currsum] = 1
            else:
                #If the sum gets repeated again that means there is a subarray whose sum is zero between 
                #the indices where sum is the same
                count+=hashmap[currsum]
                hashmap[currsum] +=1
        return count
