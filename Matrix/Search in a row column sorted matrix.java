//https://practice.geeksforgeeks.org/problems/search-in-a-matrix-1587115621/1/?track=amazon-matrix&batchId=192
//TC:O(n*m)
//SC:O(1)

class Solution 
{ 
    //Function to search a given number in row-column sorted matrix.
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    //Start from the top right corner of the matrix
	    int i = 0;
	    int j = matrix[0].length-1;
	    
	    while(i<matrix.length && j>=0){
	        if(matrix[i][j]==x)return true;
	        else if(matrix[i][j]>x)j--;
	        else{
	            i++;
	        }
	    }
	    return false;
	} 
} 
