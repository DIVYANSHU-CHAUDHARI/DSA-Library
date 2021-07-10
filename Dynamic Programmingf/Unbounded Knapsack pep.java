	import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for(int i=0;i<n;i++){
            values[i] = scn.nextInt();
        }
        for(int i=0;i<n;i++){
            weights[i] = scn.nextInt();
        }
        int cap = scn.nextInt();
        System.out.println(sol(values,weights,cap));
	    }
	    
	    public static int sol(int[] prices,int[] wts,int cap){
	        int[] dp = new int[cap+1];
	        
	        for(int i=0;i<prices.length;i++){
	            int ip = prices[i];
	            int iw = wts[i];
	            for(int j=iw;j<dp.length;j++){
	                dp[j] = Math.max(dp[j],ip+dp[j-iw]);
	            }
	        }
	        
	     return dp[cap];   
	    }
	}
