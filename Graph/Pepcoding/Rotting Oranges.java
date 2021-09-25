//https://leetcode.com/problems/rotting-oranges/
public class OPair{
    int r;
    int c;
    int t;
    
    public OPair(int r,int c,int t){
        this.r = r;
        this.c = c;
        this.t = t;
    }
}


class Solution {
    public int orangesRotting(int[][] grid) {   
        Queue<OPair> queue = new LinkedList<>();
        int[] rows = {0,1,0,-1};
        int[] cols = {1,0,-1,0};
        int orange = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                //Add all the rotten oranges to the queue first
                if(grid[i][j]==2){
                    queue.add(new OPair(i,j,0));
                }
                //Count the total no. of oranges
                if(grid[i][j] == 2  || grid[i][j] == 1 )orange++;
            }
        }
        int time =0;
        
        while(!queue.isEmpty()){
            OPair rem = queue.remove();
            //-2 value means that the node is already visited
            if(grid[rem.r][rem.c]==-2){
                continue;
            }
            grid[rem.r][rem.c] = -2;
            //Decrement the total no. of oranges picked and considered for making them rotten
            orange--;
            time = rem.t;
            //Add all the fresh oranges to the queue
            for(int dirs= 0 ;dirs<4;dirs++){
                int rr = rem.r + rows[dirs];
                int cc = rem.c + cols[dirs];
                if(rr>=0 && rr<grid.length && cc>=0 && cc<grid[0].length && grid[rr][cc]==1){
                    queue.add(new OPair(rr,cc,rem.t+1));
                }
            }
            
        }
        //If the all the fresh oranges are turned rottened than orange = 0 or else 
        //there are still some fresh oranges left.
        return orange==0?time:-1;
    }
}
