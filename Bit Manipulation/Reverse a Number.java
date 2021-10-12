//https://practice.geeksforgeeks.org/problems/reverse-bits-1611130171/1/#
//https://www.youtube.com/watch?v=TC7nCh1MZM8
//TC: O(number of bits in the binary representation of N)
//SC:O(1)

class Solution
{
    public int reverseBits(int n)
    {
        int result = 0;
        int j = 0;
        boolean flag = false;
        for(int i = 31;i>=0;i--){
            int mask = 1<<i;
            if(flag==true){
                if((n & mask)!=0){
                    //bit is set (1)
                    result = result | (1<<j);
                }
                j++;
            }else{
                if((n & mask)!=0){
                    // bit is set:(1)
                    flag = true;
                    result = result | (1<<j);
                    j++;
                }
            }
    
        }
        return result;
    }
}
