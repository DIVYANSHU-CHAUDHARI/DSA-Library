//https://leetcode.com/problems/find-all-groups-of-farmland/
//https://www.youtube.com/watch?v=y3r6TTyqJBs

//As we are traversing the matrix top to bottom left to right
//The first 1 that we encounter will be the top left corner of its respective farmland
//from that coordinate we find the bottom right corner of the farmland.
//Than add the top left and bottom right coordinates to my final result list.

class Solution {
    public int[][] findFarmland(int[][] land) {
        int m = land.length;
        int n = land[0].length;
        List<int[]> resultList= new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(land[i][j]==0)continue;
                //I have got my top left corner
                //I need to find mu bottom right corner
                //First finding rightmost column of the farmland
                int c2 = j;
                while(c2<n && land[i][c2]==1){
                    c2++;
                }
                //Finding bottom most row of the farmland
                int r2 = i;
                while(r2<m && land[r2][j]==1){
                    r2++;
                }
                
                r2 = r2==0?r2:r2-1;
                c2 = c2==0?c2:c2-1;
                
                resultList.add(new int[]{i,j,r2,c2});
                //Cover the farmland with 0 so that visit it again
                for(int k = i;k<=r2;k++){
                    for(int l= j;l<=c2;l++){
                        land[k][l]=0;
                    }
                }
            }
        }
        return resultList.toArray(new int[0][]);
    }
}
