  '''
  https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1#
  '''
  
  #Function to return Breadth First Traversal of given graph.
    def bfsOfGraph(self, V, adj):
        traversal = []
        visited = [False]*V
        at = 0
        queue= [at]
        visited[at] = True
        while len(queue)!=0:
            node = queue.pop(0)
            traversal.append(node)
            for element in adj[node]:
                if not visited[element]:
                    visited[element] =True
                    queue.append(element)
        return traversal
