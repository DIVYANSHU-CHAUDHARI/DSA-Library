//Recursive solution
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(cs(n));
    }
    
    public static int cs(int n){
        //If n is negative than there is no way to reach 
        if(n<0){
            return 0;
        }
        //zero se zero reach karne ke 1 tarika
        if(n==0){
            return 1;
        }
        int x = cs(n-1);
        int y = cs(n-2);
        int z = cs(n-3);
        
        int ans = x+y+z;
        return ans;
        
    }

}

//Memoization

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] dp = new int[n+1];
        System.out.println(cs(n,dp));
    }
    
    public static int cs(int n,int[] dp){
        //If n is negative than there is no way to reach 
        if(n<0){
            return 0;
        }
        //zero se zero reach karne ke 1 tarika
        if(n==0){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int x = cs(n-1,dp);
        int y = cs(n-2,dp);
        int z = cs(n-3,dp);
        
        int ans = x+y+z;
        dp[n] = ans;
        return ans;
        
    }

}

//Tabulation
//Main formula dp[i] = dp[i-1]+dp[i-2]+dp[i-3]
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] dp = new int[n+1];
        System.out.println(csTab(n,dp));
    }
    
    public static int csTab(int n,int[] dp){
        //Main formula dp[i] = dp[i-1]+dp[i-2]+dp[i-3]
        dp[0] = 1;
        for(int i=1;i<dp.length;i++){
            dp[i] = dp[i-1];
            if(i-2>=0){
                dp[i]+=dp[i-2];
            }
            if(i-3>=0){
                dp[i]+=dp[i-3];
            }
        }
        
        return dp[n];
    }

}
