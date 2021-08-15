//https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array0959/1/?track=amazon-searching&batchId=192
//https://drive.google.com/drive/u/1/folders/1ABjYHynsf830dE5Kz0mg_2worJ_V212-
//prateek narang solution

class Solution 
{ 
    static int Search(int array[], int target)
	{
	    int left = 0;
	    int right = array.length-1;
	    while(left<=right){
	        int mid = left + (right-left)/2;
	        if(array[mid]==target)return mid;
	        else if(array[mid]>=array[left]){
            //mid element is present in the left half 
	            if(target>=array[left] && target<=array[mid]){
	                right = mid-1;
	            }else{
	                left = mid+1;
	            }
	        }else{
            //mid element is present in the right half 
	            if(target>=array[mid] && target<=array[right]){
	                left = mid+1;
	            }else{
	                right = mid-1;
	            }
	        }
	    }
	    return -1;
	}
} 
