//https://practice.geeksforgeeks.org/problems/triplets-with-sum-with-given-range/1/#
class Solution {
    static int countTriplets(int Arr[], int N, int L, int R) {
        int rLess = TripletsLessThana(Arr,R);
        //Remember we are calculating number of triplets less than (L-1)
        int lLess = TripletsLessThana(Arr,L-1);
        return (rLess-lLess);
    }
    public static int TripletsLessThana(int[] Arr,int a){
        //Sort the array
        Arrays.sort(Arr);
        int N = Arr.length;
        int count = 0;
        //Fix the last element Arr[i]
        for(int i=N-1;i>=2;i--){
            int l = 0;
            int r = i-1;
            while(l<r){
                int threeSum = Arr[i]+Arr[l]+Arr[r];
                if(threeSum>a){
                    r--;
                }else{
                    count+=(r-l);
                    l++;
                }
            }
        }
        return count;

    }
}
