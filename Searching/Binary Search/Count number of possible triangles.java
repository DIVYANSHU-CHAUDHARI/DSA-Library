//Explanation is great here
//https://www.youtube.com/watch?v=PqEiJDdt3S4
//TC:O(n2)
//SC:O(1)


//Three sides can be the side of a triangle when the sum of any two sides is strictly greater than the third side
//(s1 + s2) > s3

//
class Solution
{
    //Function to count the number of possible triangles.
    static int findNumberOfTriangles(int arr[], int n)
    {
        Arrays.sort(arr);
        int count = 0;
        //After sorting,pick the  last element and consider it as the biggest side of the triangle
        //using two pointer approach see which pair of side lengths gives sum greater than the biggest side length
        for(int i=n-1;i>=2;i--){
            int biggestSide = arr[i];
            int left= 0;
            int right = i-1;
            while(left<right){
                if(arr[left]+arr[right]>biggestSide){
                    count+=(right-left);
                    right--;
                }else{
                    left++;
                }
            }
    }
    return count;
 }
}
