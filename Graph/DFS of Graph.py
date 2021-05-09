'''
https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1#
'''
#TC:O(V+E)
#SC:O(V)

    #Function to return a list containing the DFS traversal of the graph.
    def dfsOfGraph(self, V, adj):
        visited = [False]*V
        at = 0
        traversal = []
        
        def dfsHelper(visited,at,adj):
            nonlocal traversal
            if visited[at] :return 
            visited[at] = True
            traversal.append(at)
            for element in adj[at]:
                dfsHelper(visited,element,adj)
            return traversal
            
        return dfsHelper(visited,at,adj)
