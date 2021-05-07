'''
https://practice.geeksforgeeks.org/problems/maximize-toys0331/1
'''
    def toyCount(self, N, K, arr):
        totalCost = 0
        noItems = 0
        flag = True
        arr.sort()
        
        for i in range(N):
            if totalCost>K:
                flag = False
                break
            totalCost +=arr[i]
            noItems+=1
            
        return noItems-1 if flag==False else noItems
