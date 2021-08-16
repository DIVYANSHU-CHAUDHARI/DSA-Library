//https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1#
//Approach 1:
//Calculate the sum of all elements from 1 to N
//Calculate the sum of all elements in the array
//ans = totalSum - arraySum;
class Solution {
    int MissingNumber(int array[], int n) {
        int xor = 0;
        for(int ele:array ){
            xor = xor ^ ele;
        }
        for(int i=1;i<=array.length+1;i++){
            xor = xor ^ i;
        }
        return xor;
    }
}
