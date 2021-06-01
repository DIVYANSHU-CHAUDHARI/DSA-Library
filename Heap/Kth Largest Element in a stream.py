  '''
  https://practice.geeksforgeeks.org/problems/kth-largest-element-in-a-stream2220/1#
  '''
  #TC:O(nlogk)
  #SC:O(n) #For storing the result
  class Solution:
        def kthLargest(self, k, arr, n):
            import heapq
            result = ['-1']*(k-1)
            pq = arr[:k]
            heapq.heapify(pq)
            result.append(str(pq[0]))
            for i in range(k,len(arr)):
            #At any point the heap will only contain the largest k elements out of which the smallest element will be the kth largest
            #So when a no. less than the kth largest comes, we ignore it and continue.
                if arr[i]>pq[0]:
                    heapq.heappushpop(pq,arr[i])
                result.append(str(pq[0]))
            return ' '.join(result)
          
 #########################################################################################3
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
        
