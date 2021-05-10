'''
https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1#
'''
#TC:O(V+E)
#SC:O(V)
  #Function to detect cycle in a directed graph.

    def isCyclic(self, V, adj):
        recurStack = [False]*V 
        #To keep track of all the recursive calls 
        visited = [False]*V
        #If there are any components that are not connected,we need this for loop
        for node in range(V):
            if not visited[node]:
                if self.isCyclicHelper(adj,node,visited,recurStack) == True:
                    return True
        return False
    #Returns True if there is any cycle detected.Else,False        
    def isCyclicHelper(self,adj,node,visited,recurStack):

            visited[node] = True
            recurStack[node]=True
            
            for neighbor in adj[node]:
                if not visited[neighbor]:
                    if self.isCyclicHelper(adj,neighbor,visited,recurStack) == True:
                        return True
                #If any adjacent node of a node is already visited and is in the recursion stack
                #That means it is the ancestor of the current node and therfore a back edge is detected.
                #Which means we have detected our cycle
                elif recurStack[neighbor] == True:
                    return True
            #We pull of the Node which is explored from the recursion stack.
            recurStack[node] = False
            #Returning False if no cycle detected
            return False
