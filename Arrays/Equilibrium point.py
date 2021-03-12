"""
https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1#
"""
#TC:O(n)
#SC:O(1)
def equilibriumPoint(self,A, N):

        # Your code here
        #s denotes the right sum in every iteration
        #val denoteds the left sum in every iteration
        
        #Most efficient solution
        
        s=sum(A)
        val=0
        if N==1:
            return 1
        for i in range(N):
            s=s-A[i]
            if val==s:
                return i+1
            val+=A[i]
        return -1
        
    #My solution
    #TC: O(n)
    #SC: O(1)
    def equilibriumPoint(self,A, N):
        if len(A) == 1:
            return 1
        suml = 0
        sumr=  sum(A)-A[0]

        for i in range(N):
            if suml == sumr:
                return i+1
            else:
                if i == N-1:
                    break
                suml+=A[i]
                sumr-= A[i+1]
        return -1

