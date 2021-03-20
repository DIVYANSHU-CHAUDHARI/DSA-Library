"""
https://practice.geeksforgeeks.org/problems/count-the-triplets4615/1#
"""

	def countTriplet(self, arr, n):
	  arr.sort()
		count = 0
		start=0
		fixedInd=len(arr)-1
		#we fix the last element and using two pointers check if the sum is equal to the fixed element.
    #If not than we adjust accordingly
		while fixedInd>1:
		    start = 0
		    end = fixedInd-1
		    
		    while start<end:
    		    if arr[start]+arr[end] == arr[fixedInd]:
    		        count+=1
    		        start+=1
    		        end-=1
    		        
    		    elif arr[start]+arr[end] < arr[fixedInd]:
    		        start+=1
    		    else:
    		        end-=1
		    fixedInd-=1    
		return count
