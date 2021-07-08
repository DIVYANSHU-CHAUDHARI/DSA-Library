import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int[][] dp = new int[n][m];
        System.out.println(minCost(arr,0,0,dp));
    }
    
    public static int minCost(int[][] arr,int sr,int sc,int[][] dp){
        if(sr>=arr.length || sc>=arr[0].length){
            return Integer.MAX_VALUE;
        }
        if(sr==arr.length-1 && sc== arr[0].length-1){
            return arr[sr][sc];
        }
        if(dp[sr][sc]!=0){
            return dp[sr][sc];
        }
        int f1 = minCost(arr,sr+1,sc,dp);
        int f2 = minCost(arr,sr,sc+1,dp);
        int ans = Math.min(f1,f2) + arr[sr][sc];
        dp[sr][sc] = ans;
        return ans;
        
    }

}
