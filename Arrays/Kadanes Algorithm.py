    #Function to find the sum of contiguous subarray with maximum sum.
    def maxSubArraySum(self,a,size):
        max_ending_here = 0
        max_so_far = float('-inf')
        for i in range(size):
            max_ending_here+=a[i]
            if max_so_far<max_ending_here:
                max_so_far = max_ending_here
            
            if max_ending_here<0:
                max_ending_here = 0
        return max_so_far
            
   #Above program can be optimized further, if we compare max_so_far with max_ending_here only if max_ending_here is greater than 0. 
 
def maxSubArraySum(a,size):
	
	max_so_far = 0
	max_ending_here = 0
	
	for i in range(0, size):
		max_ending_here = max_ending_here + a[i]
		if max_ending_here < 0:
			max_ending_here = 0
		
		# Do not compare for all elements. Compare only
		# when max_ending_here > 0
		elif (max_so_far < max_ending_here):
			max_so_far = max_ending_here
			
	return max_so_far
