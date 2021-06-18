/*
https://practice.geeksforgeeks.org/problems/shortest-source-to-destination-path3544/1#
https://www.techiedelight.com/lee-algorithm-shortest-path-in-a-maze/
*/
/*
Algorithm:
1. Create an empty queue and enqueue the source cell having a distance 0 from the source (itself) and mark it as visited. 
2. Loop till queue is empty. • Dequeue the front node. • If the popped node is the destination node, then return its distance. •
Otherwise, for each of four adjacent cells of the current cell, enqueue each valid cell with +1 distance and mark them as visited. 
3. If all the queue nodes are processed, and the destination is not reached, then return false. 

Note that in BFS all cells having the shortest path as 1 are visited first followed by their adjacent cells having the shortest path as 1 + 1 = 2 and so on... 
So if we reach any node in BFS, its shortest path is one more than the shortest path of the parent. 
So, the destination cell's first occurrence gives us the result and we can stop our search there. 
It is impossible that the shortest path exists from some other cell for which we haven't reached the given node yet. 
If any such path were possible, we would have already explored it. 
*/   
            
//`(i, j, dist)` represents matrix cell coordinates, and their minimum distance from source
    # minimum distance from the source       
class GridElement{
    int x,y,dist;
    GridElement(int x,int y,int dist){
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}

class Solution {
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        if(A[0][0] == 0){
            return -1;
        }
        int[] rr = {-1,1,0,0};
        int[] cc = {0,0,1,-1};
        boolean[][] visited = new boolean[N][M];
        Queue<GridElement> q = new LinkedList<GridElement>();
        q.add(new GridElement(0,0,0));
        visited[0][0] = true;
        
        while(!q.isEmpty()){
            GridElement cell = q.poll();
            if(cell.x==X && cell.y==Y){
                return cell.dist;
            }
            for(int k=0;k<4;k++){
                if(isValid(cell.x+rr[k],cell.y+cc[k],A,visited)){
                    visited[cell.x+rr[k]][cell.y+cc[k]] = true;
                    q.add(new GridElement(cell.x+rr[k],cell.y+cc[k],cell.dist+1));
                }
            }
        }
      return -1;   
    }
//Function to check if it is possible to go to position `(row, col)`
// from the current position. The function returns false if row, col
// is not a valid position or has a value 0 or already visited.
    boolean isValid(int x,int y,int[][] A,boolean[][] visited){
        return (x>=0 && x<A.length) && (y>=0 && y<A[0].length) && (visited[x][y]==false) && (A[x][y]!=0);
    }
}
