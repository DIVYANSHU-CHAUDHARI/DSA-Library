//https://practice.geeksforgeeks.org/problems/trailing-zeroes-in-factorial5134/1#
//https://www.youtube.com/watch?v=fx8rUY_iIms


//Without computing n factorial I am still computing trailing zeros.
//Maximum integer that a primitive datatype can store in java is "long" which is (2^63-1).Our factorial value can exceed this value and therefore 
//we cannot store it.
//no. of trailing zeroes in n factorial= No. of occurences of 5 in n factorial.(as no. of occurences of 2 will definitely be greater than 5)
//No. of occurences of 'a' in n!  = floor(n/a) + floor(n/a^2) + floor(n/a^3)........till floor(n/a^x) becomes 0.

class Solution{
    static int trailingZeroes(int N){
        int div = 5;
        int trailingZeros = 0;
        while((N/div)>0){
            trailingZeros+=(N/div);
            div*=5;
        }
        return trailingZeros;
    }
}
