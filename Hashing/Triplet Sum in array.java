//TC:O(n^2)
//SC:O(1)

//Using the two-pointer theorem, we can find out a pair with a given sum in an array in O(n)

//1.Sort the given array.
//2.Loop over the array and fix the first element of the possible triplet, arr[i].
//3.Then fix two pointers, one at i + 1 and the other at n – 1. And look at the sum, 
//4.If the sum is smaller than the required number, increment the first pointer.
//5.Else, If the sum is bigger, decrease the end pointer to reduce the sum.
//6.Else, if the sum of elements at two-pointer is equal to given number return true.
class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
        int l, r;
        //Sorting the elements.
        Arrays.sort(A);
  
        //Traversing the array elements.
        for (int i = 0; i < n - 2; i++) { 
  
            //Taking two pointers. One at element after ith index and another
            //at the last index.
            l = i + 1; 
            r = n - 1; 
            while (l < r) { 
                //If sum of elements at indexes i, l and r is equal 
                //to required number, we return true.
                if (A[i] + A[l] + A[r] == X) { 
                    
                    return true; 
                } 
                //Else if the sum is less than required number, it means we need
                //to increase the sum so we increase the left pointer l.
                else if (A[i] + A[l] + A[r] < X) 
                    l++; 
                //Else the sum is more than required number and we need to
                //decrease the sum so we decrease the right pointer r.
                else
                    r--; 
            } 
        } 
  
        //returning false if no triplet sum equal to required number is present.
        return false; 
    }
}


//USing two sum by hashing(Note: 2Sum can be done more space efficiently here by using 2 poiter method as it is already getting a sorted array)
//TC:O(n^2)
//SC:O(n^2)
class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean twoSum(int[] A,int l,int r,int sum){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=l;i<=r;i++){
            map.put(A[i],i);
        }
        for(int j=l;j<=r;j++){
            int element = A[j];
            if(map.containsKey(sum-A[j]) && j!=map.get(sum-A[j]))return true;
        }
        return false;
    }
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       Arrays.sort(A);
       int r = A.length-1;
       while(r>=2){
           int i = 0;
           int j = r-1;
           int requiredSum = X-A[r];
           if(twoSum(A,i,j,requiredSum))return true;
           r--;
       }
       return false;
    }
}
