//Memoization

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        int[] dp = new int[n];
        System.out.println(maxSum(arr,0,dp));
    }
    
    public static int maxSum(int[] arr,int idx,int[] dp){
        if(idx>=arr.length){
            return 0;
        }
        if(dp[idx]!=0){
            return dp[idx];
        }
        int f1 = 0 + maxSum(arr,idx+1,dp);
        int f2 = arr[idx]+maxSum(arr,idx+2,dp);
        int sum = Math.max(f1,f2);
        dp[idx] = sum;
        return sum;
        
    }
}

//Tabulation
