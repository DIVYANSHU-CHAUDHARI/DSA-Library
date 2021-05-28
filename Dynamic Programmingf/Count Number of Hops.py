
'''
https://leetcode.com/problems/climbing-stairs/submissions/
https://practice.geeksforgeeks.org/problems/count-number-of-hops-1587115620/1/?track=md-dp&batchId=144#
'''
#TC:O(n)
#SC:O(n)
#DP approach
#Most efficient Solution
'''
So, the total number of ways to reach i^{th}ith is equal to sum of ways of reaching (i-1)^{th}step and ways of reaching (i-2)^{th} step.
Let dp[i] denotes the number of ways to reach on i^{th} step:

dp[i] = dp[i−1]+dp[i−2]
'''
class Solution:
    def climbStairs(self, n: int) -> int:
        dp = [-1]*(n+1)
        dp[0] = 1
        dp[1] = 1
        if n >=2:
            for i in range(2,n+1):
                dp[i] =dp[i-2] + dp[i-1]
        return dp[n]

#Recursive:
#Function to count the number of ways in which frog can reach the top.
    def countWays(self,n):
        if n==0:return 0
        if n >=3:
            return self.countWays(n-3) + self.countWays(n-2) + self.countWays(n-1)
        if n ==2:
            return self.countWays(n-2) + self.countWays(n-1)
        if n ==1:
            return 1
          
#Recursive + Memoized
#Time limit exceeded.
from collections import defaultdict
class Solution:
    dp = defaultdict(lambda : "Not Present")
    #Function to count the number of ways in which frog can reach the top.
    def countWays(self,n):
        if n==0:return 0
        if dp[n] != "Not Present" : return dp[n]
        
        if n >=3:
            dp[n] = self.countWays(n-3) + self.countWays(n-2) + self.countWays(n-1)
        if n ==2:
            dp[n] =self.countWays(n-2) + self.countWays(n-1)
        if n ==1:
            dp[n] = 1
        return dp[n]
