'''
https://practice.geeksforgeeks.org/problems/number-of-coins1824/1#
https://www.youtube.com/watch?v=I-l6PBeERuc
'''
#TC:O(M*V)
#SC:O(M*V)
def minCoins(self, coins, M, V):
	    #Here infinity value in a cell is represnting that we cannot find minimum no. of coins to sum up to j
	    #Therefore when we get final ans as infinty , we return -1
        nrows = M
        ncols = V
        t = [[-1 for i in range(ncols+1)] for j in range(nrows+1)]
        #Initialize the matrix
        for i in range(nrows+1):
            for j in range(ncols+1):
                if i == 0 :
                    t[i][j] = float('inf')
                if j==0 and i>0:
                    t[i][j] = 0
        for i in range(1,nrows+1):
            for j in range(1,ncols+1):
                if coins[i-1]<=j:
                    t[i][j] = min(1 + t[i][j-coins[i-1]] , t[i-1][j])
                else:
                    t[i][j] = t[i-1][j]
        return t[nrows][ncols] if t[nrows][ncols]!=float('inf') else -1
