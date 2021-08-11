//https://practice.geeksforgeeks.org/problems/product-array-puzzle4525/1#
//https://leetcode.com/problems/product-of-array-except-self/

//Without using division operator
//TC:O(n) SC:O(n)
//LC solution
public int[] productExceptSelf(int[] nums) {
        int[] prefixProduct = new int[nums.length];
        int[] suffixProduct = new int[nums.length];
        prefixProduct[0]=1;
        suffixProduct[nums.length-1] =1;
        for(int i=1;i<prefixProduct.length;i++){
            prefixProduct[i] = prefixProduct[i-1]*nums[i-1]; 
        }
        for(int i=suffixProduct.length-2;i>=0;i--){
            suffixProduct[i] = suffixProduct[i+1]*nums[i+1]; 
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = suffixProduct[i]*prefixProduct[i];
        }
        return nums;
        }
//More Efficient approach TC:O(n) SC:O(1)
//GFG solution
class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
	    long[] output = new long[nums.length];
	    output[0] = 1;
	    for(int i=1;i<nums.length;i++){
	        output[i] = output[i-1]*nums[i-1];
	    }
	    //Product of elements to the right of an element in nums array
	    long rightProd =1;
	    for(int i=output.length-1;i>=0;i--){
	        output[i] = output[i]*rightProd;
	        rightProd *=nums[i];
	    }
	    return output;
	} 
}
