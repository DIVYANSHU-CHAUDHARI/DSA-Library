    #Iterative Approach
    #TC:O(n)
    #SC:O(n)
    def nthFibonacci (ob, n):
        t = [0]*(n+1)
        t[0]=0
        t[1] =1
        for i in range(2,n+1):
            t[i] = t[i-1]+t[i-2] 
        return t[n]%1000000007
    
    #Iterative with O(1) space
    class Solution:
    def fib(self, N):
        a,b = 0,1
        for _ in range(N):
            a, b = b, a+b
        return a 
      
   #Simple Recursive
  class Solution:
    def fib(self, n: int) -> int:
        if n==0 or n==1:return n
        return self.fib(n-1)+self.fib(n-2)
'''
Time complexity : O(2^N) This is the slowest way to solve the Fibonacci Sequence because it takes exponential time. 
The amount of operations needed, for each level of recursion, grows exponentially as the depth approaches N.

Space complexity : O(N) We need space proportionate to N to account for the max size of the stack, in memory. 
This stack keeps track of the function calls to fib(N).
'''
#Recursive Memoized
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] dp  = new int[n+1];
    System.out.println(fib(n,dp));
 }
 public static int fib(int n,int[] dp){
     if(n==0 || n==1){
         return n;
     }
     if(dp[n]!=0){
         return dp[n];
     }
     int nm1 = fib(n-1,dp);
     int nm2 = fib(n-2,dp);
     int fn  = nm1+nm2;
     dp[n] = fn ;
     return fn;
 }

}
