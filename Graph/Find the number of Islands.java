/*
https://practice.geeksforgeeks.org/problems/find-the-number-of-islands/1#
'''
'''
The problem can be easily solved by applying DFS() on each component.
In each DFS() call, a component or a sub-graph is visited. We will call DFS on the next un-visited component.
The number of calls to DFS() gives the number of connected components. BFS can also be used.
'''
*/
//TC:O(n*m)
//SC:O(n*m)
//Using visited matrix
class Solution
{
    //Function to find the number of islands.
    public int numIslands(char[][] grid)
    {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        for(int i =0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(visited[i][j]==false && grid[i][j]=='1'){
                    count++;
                    dfs(i,j,visited,grid);
                }
            }
        }
        return count;
    }
    
    void dfs(int i,int j,boolean[][] visited,char[][] grid){
        int x = i;
        int y = j;
        visited[x][y] = true;
        int[] rr = {-1,-1,0,1,1,1,0,-1};
        int[] cc = {0,1,1,1,0,-1,-1,-1};
        for(int k=0;k<8;k++){
            if(isValid(x+rr[k],y+cc[k],visited,grid)){
                    visited[x+rr[k]][y+cc[k]] = true;
                    dfs(x+rr[k],y+cc[k],visited,grid);
                }
        }
    }
    boolean isValid(int x,int y,boolean[][] visited,char[][] grid){
        return (x>=0 && x<grid.length) && (y>=0 && y<grid[0].length) && visited[x][y]==false && grid[x][y]!='0';
    }
}

//Without using visited matrix(by sinking the island)
//TC:O(n*m)
//SC:O(1)
class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i =0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,grid);
                    count++;
                }
            }
        }
        return count;
    }
    
    void dfs(int i,int j,char[][] grid){
        int x = i;
        int y = j;
        grid[x][y] = '0';
        int[] rr = {-1,1,0,0};
        int[] cc = {0,0,1,-1};
        for(int k=0;k<4;k++){
            if(isValid(x+rr[k],y+cc[k],grid)){
                    dfs(x+rr[k],y+cc[k],grid);
                }
        }
    }
    boolean isValid(int x,int y,char[][] grid){
        return (x>=0 && x<grid.length) && (y>=0 && y<grid[0].length) && grid[x][y]!='0';
    }
}
   
