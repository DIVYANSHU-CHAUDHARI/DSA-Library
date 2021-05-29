'''
https://practice.geeksforgeeks.org/problems/longest-common-subsequence-1587115620/1/?track=md-dp&batchId=144#
https://leetcode.com/problems/longest-common-subsequence/
'''
#Approach 1: Recursion
#Gives Time limit exceeded error
def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        x=len(text1)
        y=len(text2)
        def lcshelper(x,y,s1,s2):
            if x==0 or y==0:return 0
            
            if s1[x-1]==s2[y-1]:
                return 1+lcshelper(x-1,y-1,s1,s2)
            else:
                return max(lcshelper(x,y-1,s1,s2),lcshelper(x-1,y,s1,s2))
          
        return lcshelper(x,y,text1,text2)
'''
Approach 2:Recursion + Memoized
'''
def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        t = [[-1 for j in range(len(text2)+1)] for i in range(len(text1)+1)]
        x=len(text1)
        y=len(text2)
        def lcshelper(x,y,s1,s2):
            if x==0 or y==0:return 0
            if t[x][y]!=-1:return t[x][y]
            if s1[x-1]==s2[y-1]:
                t[x][y]=1+lcshelper(x-1,y-1,s1,s2)
            else:
                t[x][y] = max(lcshelper(x,y-1,s1,s2),lcshelper(x-1,y,s1,s2))
          
            return t[x][y]
        return lcshelper(x,y,text1,text2)
      
 #Approach3: Bottom Up approach
    def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        t = [[-1 for j in range(len(text2)+1)] for i in range(len(text1)+1)]
        x=len(text1)
        y=len(text2)
        #Initialization
        for i in range(x+1):
            for j in range(y+1):
                if i==0 or j==0:
                    t[i][j] = 0
        for i in range(1,x+1):
            for j in range(1,y+1):
                if text1[i-1]==text2[j-1]:
                        t[i][j]=1+t[i-1][j-1]
                else:
                        t[i][j] = max(t[i][j-1],t[i-1][j])

        return t[x][y]
