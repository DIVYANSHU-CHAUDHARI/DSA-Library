  '''
  https://practice.geeksforgeeks.org/problems/form-a-palindrome2544/1/?track=md-dp&batchId=144
  '''
  
  def findMinInsertions(self, S):
        n = len(S)
        revS = S[::-1]
        dp = [[0]*(n+1) for _ in range(n+1)]
        #if i==0 or j==0 dp[i][j] = 0.This initialization is already done
        for i in range(1,n+1):
            for j in range(1,n+1):
                if S[i-1] == revS[j-1]:
                    dp[i][j] = 1 + dp[i-1][j-1]
                else:
                    dp[i][j] = max(dp[i][j-1],dp[i-1][j])
        return n - dp[n][n
