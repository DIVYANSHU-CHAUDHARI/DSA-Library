'''
https://www.interviewbit.com/problems/subset-sum-problem/
'''
'''
To solve the problem in Pseudo-polynomial time use the Dynamic programming.

So we will create a 2D array of size (|A| + 1) * (B + 1) of type boolean.
The state DP[i][j] will be true if there exists a subset of elements from A[0….i] with sum value = ‘j’. The approach for the problem is:

If (A[i] > j) DP[i][j] = DP[i-1][j]
Wlse DP[i][j] = DP[i-1][j] OR DP[i-1][sum-A[i]]
This means that if current element has value greater than ‘current sum value’ we will copy the answer for previous cases
And if the current sum value is greater than the ‘ith’ element we will see if any of previous states have already experienced the sum=’j’ OR any previous states experienced a value ‘j – A[i]’ which will solve our purpose.
The below simulation will clarify the above approach:
'''
'''
Time Complexity: O(B*n), where B is the ‘target sum’ and ‘n’ is the size of array.
Auxiliary Space: O(Bn), as the size of 2-D array is Bn.
'''
    def solve(self, A, B):
        nrows = len(A)+1
        ncols = B + 1
        t = [[-1 for i in range(ncols)] for j in range(nrows)]
        self.solveHelper(A,B,len(A),t)
        return t[nrows-1][ncols-1]
    
    def solveHelper(self,arr,sm,n,t):
        if sm == 0:
            t[n][sm] = True
            return True
        if n==0 and sm!=0:
            t[n][sm] = False
            return False
        if t[n][sm]!=-1:return t[n][sm]
        
        if arr[n-1]<=sm:
            t[n][sm] = self.solveHelper(arr,sm-arr[n-1],n-1,t) or  self.solveHelper(arr,sm,n-1,t)
        else:
            t[n][sm] = self.solveHelper(arr,sm,n-1,t)
        return 1 if t[n][sm] == True else 0
       
