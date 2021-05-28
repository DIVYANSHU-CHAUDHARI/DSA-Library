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
class Solution:
    def __init__(self):
        self.memo = defaultdict(lambda:-1)
    def fib(self, n: int) -> int:
        if n==0 or n==1:
            if self.memo[n] != -1:return self.memo[n]
            self.memo[n] = n
            return self.memo[n]
        if self.memo[n]!=-1:return self.memo[n]
        self.memo[n] = self.fib(n-1)+self.fib(n-2)
        
        return self.memo[n]
