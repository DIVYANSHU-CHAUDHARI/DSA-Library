'''
https://practice.geeksforgeeks.org/problems/merge-k-sorted-linked-lists/1#
https://leetcode.com/problems/merge-k-sorted-lists/discuss/10511/10-line-python-solution-with-priority-queue
'''

#Approach 1:Brute Force
#Traverse all the linked lists and collect the values of the nodes into an array.
#Sort and iterate over this array to get the proper value of nodes.
#Create a new sorted linked list and extend it with the new nodes.
    def mergeKLists(self, lists):
        """
        :type lists: List[ListNode]
        :rtype: ListNode
        """
        self.nodes = []
        head = point = ListNode(0)
        for l in lists:
            while l:
                self.nodes.append(l.val)
                l = l.next
        for x in sorted(self.nodes):
            point.next = ListNode(x)
            point = point.next
        return head.next
      
 #Approach2:Using MinHeap

#Create a min-heap and insert the first element of all the ‘k’ linked lists.
#As long as the min-heap is not empty, perform the following steps:
#Remove the top element of the min-heap (which is the current minimum among all the elements in the min-heap) and add it to the result list.
#If there exists an element (in the same linked list) next to the element popped out in previous step, insert it into the min-heap.
#Return the head node address of the merged list.

#Using heapq and forming a new resultant Linked List.

  #TC:Nlog(k)  #As size of heap is k and push and pop operations are N.where k is the number of linked lists.
   #SC:O(n) #As size of new Linked list is N
    def mergeKLists(self,arr,K): 
        
        head = temp = Node(0)#Dummy pointer
        pq = [] #Priority Queue
        count=0
        #pushing all the head nodes onto the heap
        for l in arr:
            if l:
                count+=1
                heapq.heappush(pq,(l.data,count,l))
        
        while len(pq)>0:
            val,c,node = heapq.heappop(pq)
            temp.next = Node(val)
            temp = temp.next
            node = node.next
            if node:
                count+=1
                heapq.heappush(pq,(node.data,count,node))
                
        return head.next
      
      
 #Aprroach 3:Similar to 2nd Approach.Only this time I am merging the linkedlists in-place instead of forming a new merged Linkedlist.
      
      #TC:Nlog(k)  #As size of heap is k and push and pop operations are N.where k is the number of linked lists.
      #SC:O(k)
      def mergeKLists(self,arr,K): 
        
        head = curr = Node(0)#Dummy pointer
        pq = [] #Priority Queue
        count=0
        #pushing all the head nodes onto the heap
        for l in arr:
            if l:
                count+=1
                heapq.heappush(pq,(l.data,count,l))
        
        while len(pq)>0:
            val,c,node = heapq.heappop(pq)
            curr.next = node
            curr = curr.next
            if curr.next:
                count+=1
                heapq.heappush(pq,(curr.next.data,count,curr.next))
                
        return head.next
