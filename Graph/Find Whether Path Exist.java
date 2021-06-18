'''
https://practice.geeksforgeeks.org/problems/find-whether-path-exist5238/1#
'''
#TC:O(n^2)
#SC:O(n^2)



#Approach1:using BFS (but can also be done using DFS)

//Acts as a tuple 
class GridElement
{
    int i,j;
    GridElement(int i,int j){
        this.i = i;
        this.j = j;
    }
    
}
class Solution
{
    //Function to find whether a path exists from the source to destination.
    
    public boolean is_Possible(int[][] grid)
    {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int[] rr = {-1,1,0,0};
        int[] cc = {0,0,1,-1};
        Queue<GridElement> q = new LinkedList<GridElement>();
        //Search for the source vertex,mark it as visited and add it to the queue
        for(int row = 0;row<grid.length;row++){
            for(int column=0;column<grid[0].length;column++){
                if(grid[row][column] == 1){
                    q.add(new GridElement(row,column));
                    visited[row][column] = true;
                    break;
                }
            }
        }
        //For every vertex check if it is 2.If not,check if its neighbors are valid then mark them as visited and add to the queue.
        while(!q.isEmpty()){
            GridElement cell = q.poll();
            if(grid[cell.i][cell.j]==2){
                return true;
            }
            for(int k=0;k<4;k++){
                if(isValid(rr[k]+cell.i,cc[k]+cell.j,visited,grid)){
                    visited[rr[k]+cell.i][cc[k]+cell.j] = true;
                    q.add(new GridElement(rr[k]+cell.i,cc[k]+cell.j));
                }
            }
        }
        
        return false;
    }
    //A vertex is only valid for BFS when it falls within the index limits of the grid and is not visited and is not 0 ie no wall is present
    public static boolean isValid(int r,int c,boolean[][] visited,int[][] grid){
        return (r>=0 && r<grid.length) && (c>=0 && c<grid[0].length) && (visited[r][c]==false) && grid[r][c]!=0;
        
    }
    
}
		      
