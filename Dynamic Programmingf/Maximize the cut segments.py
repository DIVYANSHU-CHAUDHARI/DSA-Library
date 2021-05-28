'''
https://practice.geeksforgeeks.org/problems/cutted-segments1642/1/?track=md-dp&batchId=144#
'''
#Recursively
def maximizeTheCuts(n,x,y,z):
        
        if n==0:return 0
        xcut = float('-inf')
        ycut = float('-inf')
        zcut = float('-inf')
        if x<=n:xcut = maximizeTheCuts(n-x,x,y,z)
        if y<=n:ycut = maximizeTheCuts(n-y,x,y,z)
        if z<=n:zcut = maximizeTheCuts(n-z,x,y,z)
        return 1 + max(xcut,max(ycut,zcut))

print(maximizeTheCuts(11,2,3,5))

#Memoized version
#TC:O(N)
#SC:O(N)
def maximizeTheCuts(n,x,y,z):
        dp = [-1]*(n+1)
        def maximizeHelper(n,x,y,z):
            if dp[n]!=-1:return dp[n]
            if n==0:return 0
            #I am initializing this every time I have the choice to make a 
            #cut because there could be x,y or z length which can have length 
            #greater than the available length n and when we return the maximum
            #at the end,it should not give referenced before assignment error
            xcut = float('-inf')
            ycut = float('-inf')
            zcut = float('-inf')
            if x<=n:xcut = maximizeHelper(n-x,x,y,z)
            if y<=n:ycut = maximizeHelper(n-y,x,y,z)
            if z<=n:zcut = maximizeHelper(n-z,x,y,z)
            dp[n] = 1 + max(xcut,max(ycut,zcut))
            return dp[n]
        return maximizeHelper(n,x,y,z)
