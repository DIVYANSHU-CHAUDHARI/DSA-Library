'''
https://practice.geeksforgeeks.org/problems/shortest-common-supersequence0322/1/?track=md-dp&batchId=144
'''
'''
We need to find a string that has both strings as subsequences and is shortest such string. 
If both strings have all characters different, then result is sum of lengths of two given strings. 
If there are common characters, then we don't want them multiple times as the task is to minimize length. 
Therefore, we fist find the longest common subsequence, take one occurrence of this subsequence and add extra characters. 
'''
'''
Length of the shortest supersequence  = (Sum of lengths of given two strings) - (Length of LCS of two given strings) 
'''
#Function to find length of shortest common supersequence of two strings.
    def shortestCommonSupersequence(self, X, Y, m, n):
        dp = [[0]*(n+1) for i in range(m+1)]
        #Initialization is already inherent 
        for i in range(1,m+1):
            for j in range(1,n+1):
                if X[i-1] == Y[j-1]:
                    dp[i][j] = 1 + dp[i-1][j-1]
                else:
                    dp[i][j] = max(dp[i-1][j],dp[i][j-1])
        #Length of Longest common supersequence will have the 
        #Longest common subsequence elements + elements which are uncommon in both the strings
        #Merging two strings will have the count of the common strings twice.
        #Therefore,common length sequence is reduced once
        return m+n-dp[m][n]
