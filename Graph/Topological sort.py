    '''
    https://practice.geeksforgeeks.org/problems/topological-sort/1#
    '''
  
  #TC:O(V+E)
    #SC:O(V)
    #Function to return list containing vertices in Topological order.
    
    #Refer William Fiset Video
    
    #Algorithm
    #1.Pick an unvisited node
    #2.After selecting a node,mark it as visited and perform DFS on its adjacent unvisited nodes only
    #3.Continue this till we get to a node having no outward edges.
    #4.On the recursive callback add the current node to the ordering list in reverse order.
    
    def topoSort(self, V, adj):
        visited = [False]*V
        #This list keeps all my nodes in its topological sorted order
        ordering = [-1]*V
        i = V-1
        #As we will be using DFS,therefore we will store the nodes in a reverse fashion
        #in my ordering list
        for node in range(V):
            if not visited[node]:
              i = self.DFS(node,i,ordering,adj,visited)
        #If one subset of graph is visited than it returns the index of the ordering list
        #from which we should start inserting the node of other subsets of the graph
        return ordering
        
        #i denotes the index at which we should insert the node value.
    def DFS(self,node,i,ordering,adj,visited):
        visited[node]=True
        for neighbor in adj[node]:
            if not visited[neighbor]:
               i =  self.DFS(neighbor,i,ordering,adj,visited)
        ordering[i] = node
        return i-1
