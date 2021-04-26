  '''
  https://leetcode.com/problems/reorganize-string/
  '''
  #TC:O(nlogn) #for pop and push operations
  #SC:O(n) #for heap
  def reorganizeString(self, S):
        
        import heapq
        #Form a priority queue list to apply heapify method on it.
        pq = [(-S.count(x),x) for x in set(S)] 
        #negative count is taken as by default heapify method keeps the minimum element at the top
        heapq.heapify(pq)
        result = []
        #As long as there are two elements in the heap
        while len(pq )>=2:
            nct1,ch1 = heapq.heappop(pq)
            nct2,ch2 = heapq.heappop(pq)
            result.extend([ch1,ch2])
        #We are chosing the most frequently occuring character and the second-most frequently occuring character and appending them one after the other once in every loop
            if nct1+1:heapq.heappush(pq,(nct1+1,ch1))
            if nct2+1:heapq.heappush(pq,(nct2+1,ch2))
        #We are pushing them back into the heap only when their decremented count is still greater than one i.e if their occurences are still left.
                
        #If there is still any character left,we check if its frequency is greater than 1.
        #If yes,than return empty string.Else return the string formed till.
        #Concatenation is done in the result when only 1 occurence of a character is left.
        if pq:
            if pq[0][0]<-1:return ''
            else:return ''.join(result) + pq[0][1]
        else:
            return ''.join(result)
            
            
        
        
