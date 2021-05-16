'''
https://practice.geeksforgeeks.org/problems/find-whether-path-exist5238/1#
'''
#TC:O(n^2)
#SC:O(n^2)



#Approach1:using BFS (but can also be done using DFS)
from collections import deque
class Solution:
    
    #Function to find whether a path exists from the source to destination.
	def is_Possible(self, grid):
	    visited = [[False for i in range(len(grid[0]))] for j in range(len(grid))]
	    rows = [-1,0,0,1]
	    cols = [0,-1,1,0]
	    pq = deque()
	    n = len(grid)
	    #Finding source vertex and destination vertex coordinates
		for i in range(n):
		    for j in range(n):
		        if grid[i][j] == 1:
		            source = (i,j)
		        elif grid[i][j] == 2:
		            destination = (i,j)
		#Simple BFS from here
		pq.append(source)
	    visited[source[0]][source[1]] = True
	    
	    while pq:
	        
	        (i,j) = pq.popleft()
	        if i==destination[0] and j==destination[1]:
	            return True
	        for k in range(4):
	            if self.isValid(i+rows[k],j+cols[k],grid,visited):
	                visited[i+rows[k]][j+cols[k]] = True
	                pq.append((i+rows[k],j+cols[k]))
	    return False
	
	#returns False when the coordinate is already visited or is  0
	def isValid(self,i,j,grid,visited):
	    return i>=0 and i<len(grid) \
	    and j>=0 and j<len(grid[0]) \
	    and not visited[i][j] and grid[i][j]!=0
		      
