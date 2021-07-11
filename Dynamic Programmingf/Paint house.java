import java.util.*;
  
  public class Main {
  
  	  public static void main(String[] args) {
  	  	  // TODO Auto-generated method stub
          Scanner scn= new Scanner(System.in);
          int n=scn.nextInt();
          int[][] costs= new int[n][3];
          for(int i=0;i<n;i++){
              for(int j=0;j<3;j++){
                  costs[i][j]=scn.nextInt();
              }
          }
           System.out.println(minCost(costs));
  	  }
  	  // -----------------------------------------------------
  	  // This is a functional problem. Only this function has to be written.
  	  // This function takes as input 2D array
  	  // It should return the required output
  
  	  public static int minCost(int[][] costs) {
  	      int[][] dp = new int[costs.length][costs[0].length];
  	  	  for(int i =0;i<3;i++){
  	  	      dp[0][i] = costs[0][i];
  	  	  }
  	  	  for(int i=1;i<costs.length;i++){
  	  	      dp[i][0] = costs[i][0]+Math.min(dp[i-1][1],dp[i-1][2]);
  	  	      dp[i][1] = costs[i][1]+Math.min(dp[i-1][0],dp[i-1][2]);
  	  	      dp[i][2] = costs[i][2]+Math.min(dp[i-1][0],dp[i-1][1]);
  	  	  }
  	  	  int minimum = Integer.MAX_VALUE;
  	  	 for(int i =0;i<3;i++){
  	  	      minimum = Math.min(dp[dp.length-1][i],minimum);
  	  	  }
  	  	  return minimum;
  	  }
  }
