//https://practice.geeksforgeeks.org/problems/maximize-number-of-1s0905/1#
//Approach1 :
//TC:O(n2)
//SC:O(1)
//A Simple Solution is to consider every subarray by running two loops. For every subarray, count number of zeroes in it. 
//Return the maximum size subarray with m or less zeroes. Time Complexity of this solution is O(n2).

//Efficient approach
//TC: O(n)
//SC: O(1)
class Solve {
    // m is maximum of number zeroes allowed to flip
    
    //Idea is
    //the subarray with maximum 1's after flipping atmost m 0's  = length of maximum subarray having exactly m 0's
    int findZeroes(int arr[], int n, int m) {
        //Maintain two pointers
        //Make sure the no. of zeroes in the subarray between the two pointers is equal to m
        //As soon as the no. of zeroes becomes greater than m,we increment i till the index where we decrease 1 zero from the 
        //subarray and again maintain m 0's in the subarray between the two pointers.
        
        //Simulateously update the maximum length subarray with exactly m 0's
        int i = 0,j=0,zeroCount = 0;
        int len = Integer.MIN_VALUE;
        while(j<n){
            if(arr[j] == 0)zeroCount++;
            if(zeroCount>m){
                len = Math.max(len,j-i);
                while(i<n && zeroCount>m){
                    if(arr[i]==0){
                        zeroCount--;
                    }
                    i++;
                }
            }
            j++;
        }
        len = Math.max(len,j-i);
        return len;
    }
}
