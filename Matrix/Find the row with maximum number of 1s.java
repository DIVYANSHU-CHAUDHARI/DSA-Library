//Brute force count no. of 1's in every row
//TC:O(n*m)

//More efficient approach
//Finding the left most occurence of 1 in every row using Binary search and saving the row with maximum ones
//TC:O(n*log(m))

//Most efficient approach
//TC:O(n+m)
//SC:O(1)
class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int j,max_row_index = 0;
            j = C - 1;
 
        for (int i = 0; i < R; i++) {
            // Move left until a 0 is found
            while (j >= 0 && mat[i][j] == 1) {
                j = j - 1; // Update the index of leftmost 1
                       // seen so far
                max_row_index = i; // Update max_row_index
            }
        }
          if(max_row_index==0&&mat[0][C-1]==0)
              return -1;
        return max_row_index;
    }
}
