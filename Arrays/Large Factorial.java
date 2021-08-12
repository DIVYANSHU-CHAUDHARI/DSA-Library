//TC:O(max(A)+N)
//SC:O(max(A))
//Find the max element and create an array of size (maxElement + 1) which stores the factorial of all numbers from 1 to maxElement+1;
//Store the result of the required nos from fact array to result array.

class Solution {
    public long[] factorial(long a[], int n) {
        int max = 100_000;
        long maxElement = a[0];
        for(int i =1;i<a.length;i++){
            if(a[i]>maxElement)maxElement = a[i];
        }
        
        long[] fact = new long[(int)maxElement+1];
        long mod = 1000_000_007;
        fact[0] = 1;
        for(int i=1;i<fact.length;i++){
            fact[i] = (fact[i-1]*(long)i)%mod;
        }
        long[] result = new long[n];
        for(int i=0;i<result.length;i++){
            result[i] = fact[(int)a[i]];
        }
        return result;
    }   
}


//Solution given by gfg
class Solution {
    public long[] factorial(long a[], int n) {
        int max = 100_000;
        long[] fact = new long[max+1];
        long mod = 1000_000_007;
        fact[0] = 1;
        for(int i=1;i<fact.length;i++){
            fact[i] = (fact[i-1]*(long)i)%mod;
        }
        long[] result = new long[n];
        for(int i=0;i<result.length;i++){
            result[i] = fact[(int)a[i]];
        }
        return result;
    }   
}
