'''
https://practice.geeksforgeeks.org/problems/shortest-source-to-destination-path3544/1#
https://www.techiedelight.com/lee-algorithm-shortest-path-in-a-maze/
'''
'''
Algorithm:
1. Create an empty queue and enqueue the source cell having a distance 0 from the source (itself) and mark it as visited. 
2. Loop till queue is empty. • Dequeue the front node. • If the popped node is the destination node, then return its distance. •
Otherwise, for each of four adjacent cells of the current cell, enqueue each valid cell with +1 distance and mark them as visited. 
3. If all the queue nodes are processed, and the destination is not reached, then return false. 
'''
'''
Note that in BFS all cells having the shortest path as 1 are visited first followed by their adjacent cells having the shortest path as 1 + 1 = 2 and so on... 
So if we reach any node in BFS, its shortest path is one more than the shortest path of the parent. 
So, the destination cell's first occurrence gives us the result and we can stop our search there. 
It is impossible that the shortest path exists from some other cell for which we haven't reached the given node yet. 
If any such path were possible, we would have already explored it. 
'''
from collections import deque
class Solution:
    def shortestDistance(self,N,M,A,X,Y):
        if A[0][0] == 0:return -1
        visited = [[False for i in range(M)] for j in range(N)]
        pq = deque()
 # `(i, j, dist)` represents matrix cell coordinates, and their
    # minimum distance from the source
        pq.append((0,0,0))
         
# Below lists detail all four possible movements from a cell
        rows = [-1, 0, 0, 1]
        cols = [0, -1, 1, 0]
# mark the source cell as visited and enqueue the source nod
        visited[0][0] = True
        
        while pq:
            (i,j,dist) = pq.popleft()
            if i == X and j==Y:
                return dist
            for k in range(4):
                # check if it is possible to go to position
            # `(i + row[k], `j` + col[k])` from current position
                if self.Valid(visited,i+rows[k],j+cols[k],A,N,M):
                    # mark next cell as visited and enqueue it
                   visited[i+rows[k]][j+cols[k]]=True
                   pq.append((i+rows[k],j+cols[k],dist+1))
        return -1
# Function to check if it is possible to go to position `(row, col)`
# from the current position. The function returns false if row, col
# is not a valid position or has a value 0 or already visited.
    def Valid(self,visited,i,j,A,N,M):
        return (i>=0 and i<N) and (j>=0 and j<M) and (not visited[i][j]) and A[i][j]
            
