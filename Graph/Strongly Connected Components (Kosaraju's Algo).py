'''
https://practice.geeksforgeeks.org/problems/strongly-connected-components-kosarajus-algo/1#
'''
#TC:O(V+E)
#SC:O(V)

from collections import defaultdict
class Solution:
    
    #Function to find number of strongly connected components in the graph.
    def kosaraju(self, V, adj):
        #newAdj to store the new transposed matrix
        newAdj = defaultdict(list)
        visited = [False]*V
        #To know the order in which to make DFS calls in the transposed graph
        stack = []
        count = 0
        for i in range(V):
            if not visited[i]:
               stack = self.DFS(i,adj,stack,visited)
        self.transposeGraph(adj,newAdj)
        visited = [False]*V
        
        while len(stack)!=0:
            node = stack.pop()
            if not visited[node]:
                self.DFSUtil(node,newAdj,visited)
                count+=1
        return count
        
    #For dfs traversal on the transposed graph     
    def DFSUtil(self,node,newAdj,visited):
        visited[node] = True
        for neighbor in newAdj[node]:
            if not visited[neighbor]:
                self.DFSUtil(neighbor,newAdj,visited)
                
    #DFS traversal for filling my stack in the order of their finish times
    #Node with the highest finish time is at the top of the stack and the earliest at the bottom.
    
    def DFS(self,node,adj,stack,visited):
        visited[node]=True
        for neighbor in adj[node]:
            if not visited[neighbor]:
                self.DFS(neighbor,adj,stack,visited)
        stack.append(node)
        return stack
     
    #To reverse the graph.Using defaultdict(list) so that I have a default list for the value 
    #I am appending for every key
    def transposeGraph(self,adj,newAdj):
        #newAdj = [[]]*len(adj)
        for vertex in range(len(adj)):
            for neighbor in adj[vertex]:
                newAdj[neighbor].append(vertex)
    
        return newAdj
