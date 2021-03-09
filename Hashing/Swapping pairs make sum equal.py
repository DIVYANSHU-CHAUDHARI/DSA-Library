"""
https://www.geeksforgeeks.org/find-a-pair-swapping-which-makes-sum-of-two-arrays-same/
"""
#Aprroach 1:Brute force 
"""
Approach 2:
We are looking for two values, a and b, such that: 

sumA - a + b = sumB - b + a (Take away a from A and insert b and same for B)
    2a - 2b  = sumA - sumB
      a - b  = (sumA - sumB) / 2
      
we’re looking for two values that have a specific target difference: (sumA – sumB) / 2.

"""
# Python Code for naive implementation 

# Function to calculate sum of elements of list 
def getSum(X): 
	sum=0
	for i in X: 
		sum+=i 
	return sum

# Function to calculate : a-b = (sumA - sumB) / 2 
def getTarget(A,B): 

	#Calculations of sums from both lists 
	sum1=getSum(A) 
	sum2=getSum(B) 

	# Because the target must be an integer 
	if( (sum1-sum2)%2!=0): 
		return 0
	return (sum1-sum2)/2


def findSwapValues(A,B): 
	target=getTarget(A,B) 
	if target==0: 
		return

	# Boolean variable used to reduce further iterations 
	# after the pair is found 
	flag=False

	# Look for val1 and val2, such that 
	# val1 - val2 = (sumA -sumB) /2 
	val1,val2=0,0
	for i in A: 
		for j in B: 
			
			if i-j == target: 
				val1=i 
				val2=j 
				# Set to True when pair is found 
				flag=True
				break
		if flag==True: 
			break
	print val1,val2 
	return


# Driver code 
A=[4,1,2,1,1,2] 
B=[3,6,3,3] 

# Call to function 
findSwapValues(A,B) 


#Time Complexity :- O(n*m)


#Approach3 Optimized Solution:
def findSwapValues(self,a, n, b, m):
        a.sort()
        b.sort()
        i = 0
        j = 0
        if (sum(a)-sum(b))%2==0:
            target = (sum(a)-sum(b))/2
        else:
            return -1
            
        while i<len(a) and j<len(b):
            if a[i]-b[j] == target:
                return 1
            elif a[i]-b[j]<target:
                i+=1
            else:
                j+=1
        return -1
#If arrays are sorted : O(n + m)
#If arrays aren’t sorted : O(nlog(n) + mlog(m))
