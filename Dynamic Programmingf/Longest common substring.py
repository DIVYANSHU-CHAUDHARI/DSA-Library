'''
https://practice.geeksforgeeks.org/problems/longest-common-substring1452/1/?track=md-dp&batchId=144
video - TOp 50 algos
'''
#Approach 1:
'''
Let m and n be the lengths of first and second strings respectively.
A simple solution is to one by one consider all substrings of first string and for every substring check if it is a substring in second string. 
Keep track of the maximum length substring. There will be O(m^2) substrings and we can find whether a string is subsring on another string in O(n) time (See this). 
So overall time complexity of this method would be O(n * m2)
'''
#TC:O(n*m2)
#SC:O(1)
maxlen = 0
for i in range(n):
  for j in range(i+1,m):
    if str1[i:j] in str2: 
      maxlen = max(maxlen,j-i)
return maxlen
#Approach2 :
#TC:O(nm)
#SC:O(nm)  
def longestCommonSubstr(self, S1, S2, n, m):
        dp  = [[0]*(m+1) for j in range(n+1)]
        #For base cases the first row and the first column 
        #needs to be initialized with 0
        maxlen = 0
        for i in range(1,n+1):
            for j in range(1,m+1):
                if S1[i-1] == S2[j-1]:
                    dp[i][j] = 1 + dp[i-1][j-1]
                    maxlen = max(maxlen,dp[i][j])
                else:
                    dp[i][j] = 0
        return maxlen
