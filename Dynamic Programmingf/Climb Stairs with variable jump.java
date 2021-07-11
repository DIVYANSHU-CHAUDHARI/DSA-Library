//Recursive approach
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] stairs = new int[n];
        for(int i=0;i<stairs.length;i++){
            stairs[i] = scn.nextInt();
        }
        System.out.println(cs(stairs,0));
    }
    public static int cs(int[] stairs,int idx){
        if(idx>stairs.length){
            return 0;
        }
        if(idx==stairs.length){
            return 1;
        }
        int sum = 0;
        //No. of ways to reach from 0th step to nth step = summ of no. of ways to reach from steps(reachable from 0th step) to nth step
        for(int i=1;i<=stairs[idx];i++){
            sum+=cs(stairs,idx+i);
        }
        return sum;
    }
}

//Memoization
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] stairs = new int[n];
        for(int i=0;i<stairs.length;i++){
            stairs[i] = scn.nextInt();
        }
        int[] dp = new int[n];
        System.out.println(cs(stairs,0,dp));
    }
    public static int cs(int[] stairs,int idx,int[] dp){
        if(idx>stairs.length){
            return 0;
        }
        if(idx==stairs.length){
            return 1;
        }
        if(dp[idx]!=0){
            return dp[idx];
        }
        int sum = 0;
        //No. of ways to reach from 0th step to nth step = summ of no. of ways to reach from steps(reachable from 0th step) to nth step
        for(int i=1;i<=stairs[idx];i++){
            sum+=cs(stairs,idx+i,dp);
        }
        dp[idx] = sum;
        return sum;
    }
}

//Tabulation
