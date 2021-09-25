//https://leetcode.com/problems/number-of-enclaves/

class Solution {
    static int[] rows = {1,0,0,-1};
    static int[] cols = {0,1,-1,0};
    public int numEnclaves(int[][] grid) {
        int count = 0;
        //For 0th row
        for(int c=0;c<grid[0].length;c++){
            if(grid[0][c]==1){
                numEnClavesDFS(grid,0,c);
            }
        }
        
        //For last row
         for(int c=0;c<grid[0].length;c++){
            if(grid[grid.length-1][c]==1){
                numEnClavesDFS(grid,grid.length-1,c);
            }
        }
        //For 0th column
        for(int r=0;r<grid.length;r++){
            if(grid[r][0]==1){
                numEnClavesDFS(grid,r,0);
            }
        }
        //For last column
        for(int r=0;r<grid.length;r++){
            if(grid[r][grid[0].length-1]==1){
                numEnClavesDFS(grid,r,grid[0].length-1);
            }
        }
        //Count of remainign one's
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c] == 1)count++;
        }
            
        }
        
        return count;
    }
    public void numEnClavesDFS(int[][] grid,int i,int j){
        grid[i][j] = 0;
        for(int dir =0;dir<4;dir++){
            int rr = i + rows[dir];
            int cc = j + cols[dir];
            if(rr>=0 && rr<grid.length && cc>=0 && cc<grid[0].length&&grid[rr][cc]==1){
              numEnClavesDFS(grid,rr,cc);  
            }
        }
        
    }
}
