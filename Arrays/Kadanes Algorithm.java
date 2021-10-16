//TC:O(n)
//SC:O(1)

//https://www.youtube.com/watch?v=jnoVtCKECmQ
//https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSubSum = Integer.MIN_VALUE;

        for(int ele:nums){
            sum+=ele;
            sum = Math.max(sum,ele);
            maxSubSum = Math.max(maxSubSum,sum);
        }
        return maxSubSum;
    }
}
