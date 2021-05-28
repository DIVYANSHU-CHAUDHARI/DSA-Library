'''
https://practice.geeksforgeeks.org/problems/coin-change2448/1/?track=md-dp&batchId=144#
https://leetcode.com/problems/coin-change-2/
'''

#Approach1:
#TC:O(n*m)
#SC:O(n*m)
    def change(self, amount: int, coins: List[int]) -> int:
        nrows = len(coins)
        ncols = amount
        dp = [[-1 for j in range(ncols+1)]for i in range(nrows+1)]
        #Initialization of dp
        for i in range(nrows+1):
            for j in range(ncols+1):
                if i == 0 :
                    dp[i][j] = 0
                if j==0:
                    dp[i][j] = 1
        for i in range(1,nrows+1):
            for j in range(1,ncols+1):
                if coins[i-1]<=j:
                    dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j]
                else:
                    dp[i][j] = dp[i-1][j]
        return dp[nrows][ncols]
      
  #Space efficient approach using a single array
  #SC:O(n)
  #TC:O(n*m)
  '''
  https://www.youtube.com/watch?v=l_nR5X9VmaI
  '''
      def change(self, amount: int, coins: List[int]) -> int:
        dp = [0]*(amount+1)
        #Every element in this array gives the no. of combinations of denominations to reach that amount(which is represented by the index)
        #No. of ways of paying amount of 0 with the available coins is 1 i.e not taking any coin
        dp[0] = 1
        for element in coins:
            #element of every iteration represents a coin denomination.
            #In every iteration we update with the number of combinations possible for every sum from that element till the amount whose combinations we finally want.
            #These updations are done in stages.Eg.
            #We first update the no. of combinations possible for every amount with only denomination 2
            #Than we update the no. of combinations possible for every amount with denomination 3(considering denomination 2 was used earlier to update the no. of combinations)
            #Same goes for further iterations
            for i in range(element,len(dp)):
            #No. of ways of paying i amount will be the no. of ways for paying i-element amount
                dp[i] += dp[i-element]
        return dp[-1]
                
            
        
