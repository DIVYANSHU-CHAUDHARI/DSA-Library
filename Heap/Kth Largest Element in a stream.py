  '''
  https://practice.geeksforgeeks.org/problems/kth-largest-element-in-a-stream2220/1#
  '''
  #TC: O(nlogn)
  #SC: O(n)
  def kthLargest(self, k, arr, n):

        import heapq
        #result = [-1]*(k-1)
        for i in range(k-1):
            print(-1,end=' ')
        pq = arr[:k]
        heapq.heapify(pq)
        #result.append(pq[0])
        print(pq[0],end=' ')
        for i in range(k,len(arr)):
            #pq.append(arr[i])
            #heapq.heapify(pq)
            if arr[i]>pq[0]:
                heapq.heappop(pq)
                heapq.heappush(pq,arr[i])
            #result.append(pq[0])
           
            print(pq[0],end=' ')
        #return result
        
