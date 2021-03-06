//Tabulation
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] deno = new int[n];
        for(int i=0;i<n;i++){
            deno[i] = scn.nextInt();
        }
        int amount = scn.nextInt();
        System.out.println(ccp(deno,amount));
    }
    
    public static int ccp(int[] denoms,int amount){
        int[] dp = new int[amount+1];
        dp[0] = 1;
        
        for(int i=1;i<dp.length;i++){
           for(int j=0;j<denoms.length;j++){
               int coin = denoms[j];
               if(i-coin>=0){
                   dp[i]+=dp[i-coin];
               }
               
           } 
            
        }
        return dp[amount];
    }
}
