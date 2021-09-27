//https://practice.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1#

//Step1.See which is the smaller array among the two.
//Step2.Polpulate a set with all the unique elements of the smaller array
//Step3.Itterate through the larger array and see if that element is present in the set.
//Step4.If present,increment count and remove the element from the set. and continue till all the elements of the larger array are checked.
//Step5.return count.

class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int Helper(int[] arr1,int[] arr2,int n,int m){
        //Assuming n>m
        int count = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int ele:arr2){
            set.add(ele);
        }
        for(int x:arr1){
            if(set.contains(x)){
                count++;
                set.remove(x);
            }
        }
        return count;
    }
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        int result = 0;
        if(n>=m){
            result = Helper(a,b,n,m);
        }else{
            result = Helper(b,a,m,n);
        }
        return result;
    }
};
