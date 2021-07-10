//Recursion(Memoization remaining)
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       String str = scn.nextLine();
       System.out.println(ce(str,0));
    }
    
    public static int ce(String str,int idx){
        if(idx == str.length()){
            return 1;
        }
        if(str.charAt(idx)=='0'){
            return 0;
        }
        int f1 = ce(str,idx+1);
        int f2 = 0;
        if(idx+1<str.length() && Integer.parseInt(str.substring(idx,idx+2))<=26){
            f2 = ce(str,idx+2);
        }
        int ans = f1+f2;
        return ans;
    }
}


//Tabulation

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       String str = scn.nextLine();
       System.out.println(ce(str,0));
    }
    
    public static int ce(String str,int idx){
       int[] dp = new int[str.length()+1];
       //dp[i] stores the count of no. of enocodings possible from substring str[0->(i-1)]
       dp[0] = dp[1] = 1 ;
       for(int i=2;i<dp.length;i++){
           int cc = str.charAt(i-1)-'0';
           int pc = str.charAt(i-2)-'0';
           if(pc==0 && cc==0){
               dp[i] = 0;
           }else if(pc==0){
               dp[i] = dp[i-1];
           }else if(cc==0){
               if((pc*10+cc)<=26){
                   dp[i] = dp[i-2];
               }
           }else{
               dp[i]=dp[i-1];
               if((pc*10+cc)<=26){
                   dp[i] += dp[i-2];
               }
           }
       }
       return dp[dp.length-1];
    }
}
