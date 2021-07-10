//Tabulation method
//https://youtu.be/Ph1EB07Q4pA?list=TLGGEDoCezyW5A4xMDA3MjAyMQ

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
        
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for(int i=0;i<deno.length;i++){
            int coin = deno[i];
            for(int j=coin;j<dp.length;j++){
                dp[j] += dp[j-coin];
            }
        }
        System.out.println(dp[amount]);
    }
}
