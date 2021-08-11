  '''
  https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1#
  '''
  #TC:O(N)
  #SC:O(1)
  
  #algorithm
  #array - 1,2,3,4,5 rotate left by 2 to give 3,4,5,1,2
  #Step1 : Reverse : 5,4,3,2,1
  #Step2 : Reverse last D elements: 5,4,3,1,2
  #Step3: Reverse remaining elements: 3,4,5,1,2
  
class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        reverse(arr,0,n-1);
        reverse(arr,n-d,n-1);
        reverse(arr,0,n-d-1);
        
    }
    
    static void reverse(int[] arr,int start,int end){
        int left = start;
        int right = end;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
