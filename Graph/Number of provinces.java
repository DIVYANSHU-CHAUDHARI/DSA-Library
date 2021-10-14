//https://leetcode.com/problems/number-of-provinces/

//TC:O(v^2) where v is the no. of vertices
class Solution {
    public static void ConnectedComponent(int src,int[][] isConnected,boolean[] visited){
        visited[src] = true;
        int cols = isConnected.length;
        for(int j=0;j<cols;j++){
            if(isConnected[src][j]==1 && visited[j]==false){
                ConnectedComponent(j,isConnected,visited);
            }
        }
    }
    
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;
        for(int v=0;v<n;v++){
            if(visited[v]==false){
                count++;
                ConnectedComponent(v,isConnected,visited);
            }
        }
        return count;
    }
}
