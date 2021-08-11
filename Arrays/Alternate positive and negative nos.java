
//https://practice.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1#
//TC:O(n)
//SC:O(1)

//https://www.youtube.com/watch?v=V_QB59AaeCk

//Logic is even indices should have positive nos and odd indices should have negative nos.
//If an value at an index is +ve instead of -ve and vice-versa ,we find the next positive or negative index on the right side
//of the array.If found we rotate the array from the incorrect index position to the right 1 step and replace the incorrect position
//value with the suitable alternate sign value.
class Solution {
    void rearrange(int arr[], int n) {
        int k = 0;
        int i = 0;//for searching the next positive index from 
        int j = 0;
        
        while(i<n && j<n && k<n){
            //for even index
            //If a negative no. is present on even index find the next positive no. using index i
                if(k%2==0){
                 if(arr[k]<0){
                    i =k;
                    j = k;
                    while(i<n && arr[i]<0)i++;
                    if(i>=n)break;
                    rotate(arr,j,i);
                    }
            //If a positive no. is present on odd index find the next negative no. using index j
                }else{ //for odd index
                    if(arr[k]>=0){
                    i =k;
                    j = k;
                    while(j<n && arr[j]>=0)j++;
                    if(j>=n)break;
                    rotate(arr,i,j);
                        }
                    }
                k++;
                }
}
    void rotate(int[] arr,int start,int end){
        int temp = arr[end];
        int idx = end;
        while(idx>=0 && idx>start){
            arr[idx] = arr[idx-1];
            idx--;
        }
        arr[start] = temp;
    }
}
