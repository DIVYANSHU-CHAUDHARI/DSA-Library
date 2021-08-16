//https://practice.geeksforgeeks.org/problems/the-painters-partition-problem1535/1/#
/*
We know that the invariant of binary search has two main parts:

the target value would always be in the searching range.
the searching range will decrease in each loop so that the termination can be reached.
We also know that the values in this range must be in sorted order. 
Here our target value is the maximum sum of a contiguous section in the optimal allocation of boards.
Now how can we apply binary search for this? We can fix the possible low to high range for the target value 
and narrow down our search to get the optimal allocation.

We can see that the highest possible value in this range is the sum of all the elementsin the array and this happens when we allot
1 painter all the sections of the board. The lowest possible value of this range is the maximum value of the array max, as in this
allocation we can allot max to one painter and divide the other sections such that the cost of them is less than or equal to max and 
as close as possible to max. Now if we consider we use x painters in the above scenarios, it is obvious that as the value in the range increases,
the value of x decreases and vice-versa. From this we can find the target value when x=k and use a helper function to find x, 
the minimum number of painters required when the maximum length of section a painter can paint is given.
*/
//TC:O(nlogm)
//SC:O(1)
 class Solution{
    static long minTime(int[] arr,int n,int k){
        long lo = getMax(arr, n); 
        long hi = getSum(arr, n);
    
        while (lo <= hi) { 
            long mid = lo + (hi - lo) / 2; 
            long requiredPainters = numberOfPainters(arr, n, mid);
    
            if (requiredPainters <= k) 
                hi = mid-1;
    
            else
                lo = mid + 1; 
        } 
        return lo; 
    } 
    static long getMax(int arr[], int n) { 
        long max = Integer.MIN_VALUE; 
        for (int i = 0; i < n; i++)  
            if (arr[i] > max) 
                max = arr[i];
    
        return max; 
    } 
    static long getSum(int arr[], int n) { 
        long total = 0; 
        for (int i = 0; i < n; i++) 
            total += arr[i]; 
        return total; 
    } 
    
    static long numberOfPainters(int arr[], int n, long maxLen) { 
    long total = 0, numPainters = 1; 
    for (int i = 0; i < n; i++) { 
        total += arr[i]; 
       if (total > maxLen) { 
            // for next count 
            total = arr[i]; 
            numPainters++; 
        } 
    } 
    return numPainters; 
} 
    
}
