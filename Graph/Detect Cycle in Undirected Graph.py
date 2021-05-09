  '''
  https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1/#
  '''
  #TC:O(V+E)
  #SC:O(V)
  #Function to detect cycle in an undirected graph.
	def isCycle(self, V, adj):
		
        # Mark all the vertices 
        # as not visited
        visited =[False]*(V)
        
        # Call the recursive helper 
        # function to detect cycle in different
        # DFS trees
        for i in range(V):
          
            # Don't recur for u if it 
            # is already visited
            if not visited[i]: 
                if(self.isCyclicUtil(i,visited,-1,adj)) == True:
                    return True
        
        return False
        
    def isCyclicUtil(self,v,visited,parent,adj):

        # Mark the current node as visited 
        visited[v]= True

        # Recur for all the vertices 
        # adjacent to this vertex
        for adjacentNode in adj[v]:
            
            # If the node is not 
            # visited then recurse on it
            if  not visited[adjacentNode] : 
                if(self.isCyclicUtil(adjacentNode,visited,v,adj))==True:
                    return True
            # If an adjacent vertex is 
            # visited and not parent 
            # of current vertex,
            # then there is a cycle
            elif  parent!=adjacentNode:
                return True
        
        return False
