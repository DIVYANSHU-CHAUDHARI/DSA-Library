  '''
  https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1#
  '''
  #TC:O(nlogn)
  #SC:O(n)
  
  #Function to return the minimum cost of connecting the ropes.
    def minCost(self,arr,n):
        import heapq
        pq = arr
        heapq.heapify(pq)
        minCost = 0
        while len(pq)>1:
            #Always taking the minimum two length ropes,connecting them and pushing its length back
            #into the priority queue till we get a single rop,will give us the minimum cost to 
            #connect them
            no1 = heapq.heappop(pq)
            no2 = heapq.heappop(pq)
            minCost+=no1+no2
            heapq.heappush(pq,no1+no2)
        return minCost
            
