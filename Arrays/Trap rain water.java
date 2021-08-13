//TC:O(n)
//SC:O(n)
//MaxLeft array stores the height of the maximum block on its left side.
//MaxRight array stores the height of the maximum block on its right side.
//Water that can be trapped exactly above the block = min(leftMax_ht.,rightMax_ht.)-(ht.currentBlock)
//Sum all the water trpaped above evry indivdual block to get the total water trapped 
class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static int trappingWater(int arr[], int n) { 
    
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];
        int totalWater = 0;
        maxLeft[0] = arr[0];
        maxRight[n-1] = arr[n-1];
        for(int i=1;i<n;i++){
            maxLeft[i] = Math.max(maxLeft[i-1],arr[i]);
        }
        for(int i=n-2;i>=0;i--){
            maxRight[i] = Math.max(maxRight[i+1],arr[i]);
        }
        for(int i=1;i<n-1;i++){
            totalWater+=Math.min(maxLeft[i],maxRight[i])-arr[i];
        }
        return totalWater;
    } 
}


