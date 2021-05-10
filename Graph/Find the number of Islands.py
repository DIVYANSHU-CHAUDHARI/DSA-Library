'''
https://practice.geeksforgeeks.org/problems/find-the-number-of-islands/1#
'''
'''
The problem can be easily solved by applying DFS() on each component.
In each DFS() call, a component or a sub-graph is visited. We will call DFS on the next un-visited component.
The number of calls to DFS() gives the number of connected components. BFS can also be used.
'''
    #Function to find the number of islands.
    def safe(self,i,j,grid,visited):
        return (i>=0 and i<len(grid)) and (j>=0 and j<len(grid[0])) and grid[i][j] and not visited[i][j]
        
    def DFS(self,grid,i,j,visited):
        rows = [-1,-1,0,1,1,1,0,-1]
        cols = [0,1,1,1,0,-1,-1,-1]
        visited[i][j] = True
        for k in range(8):
            if self.safe(i+rows[k],j+cols[k],grid,visited):
                self.DFS(grid,i+rows[k],j+cols[k],visited)
                
	def numIslands(self, grid):
	    noRows = len(grid)
	    noColumns = len(grid[0])
	    visited = [[False for j in range(noColumns)]for i in range(noRows)]
	    noOfIslands = 0
        for i in range(noRows):
            for j in range(noColumns):
                if not visited[i][j] and grid[i][j] == 1:
                    noOfIslands+=1
                    self.DFS(grid,i,j,visited)
        return noOfIslands
