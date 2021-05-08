  '''
  https://practice.geeksforgeeks.org/problems/shop-in-candy-store1145/1#
  '''
  #TC:O(nlog(n))
  #SC:O(1)
  def candyStore(self, candies,N,K):
        candies.sort()
        i = 0
        j = N-1
        amountSpent = [0,0]
        currAmount = 0
        #Pick the smallest element and skip largest K elements in every iteration
        while i<=j:
            currAmount+=candies[i]
            i+=1
            j-=K
        amountSpent[0] = currAmount
        
        currAmount = 0
        i = 0
        j = N-1
        #Pick the biggest element and skip smallest K elements in every iteration
        while i<=j:
            currAmount+=candies[j]
            i+=K
            j-=1
        amountSpent[1] = currAmount
