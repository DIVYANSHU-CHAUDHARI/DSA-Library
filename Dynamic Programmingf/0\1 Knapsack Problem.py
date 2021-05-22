  #TC:O(W*N)
  #SC:O(W*N)
  '''
  https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1#
  '''
  
  #Function to return max value that can be put in knapsack of capacity W.
    def knapSack(self,W, wt, val, n):
        nrows = n+1
        ncols = W+1
        #Declaring Matrix
        myMatrix = [[-1 for i in range(ncols)] for j in range(nrows)]
        #Initializing matrix with values of base cases 
        for i in range(nrows):
            for j in range(ncols):
                if i==0 or j==0:
                    myMatrix[i][j] = 0
        
                    
        for i in range(1,nrows):
            for j in range(1,ncols):
                if wt[i-1]<=j:
                    myMatrix[i][j] = max((val[i-1]+myMatrix[i-1][j-wt[i-1]]),myMatrix[i-1][j])
                else:
                    myMatrix[i][j] = myMatrix[i-1][j]
                    
        return myMatrix[nrows-1][ncols-1]
