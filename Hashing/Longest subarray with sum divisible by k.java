//TC:O(n)
//SC:O(n)
//https://practice.geeksforgeeks.org/problems/longest-subarray-with-sum-divisible-by-k1259/1
//https://www.youtube.com/watch?v=GrV3MTR_Uk0
//Main logic is
//If two prefix sums leave same remainder when divided by k than the array between them has sum divisible by k
//Eg. prefix sum1 = kn+x;
//    prefix sum2 = km+x;
//    sum2 is greater than sum1 => sum2-sum1 = km+x-kn-x = k(m-n) => divisible by k
//    => Array between sum2 and sum1 is divisible by k

class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefixSum = 0;
        //Hashmap is mapping Unique remainder as key and index of first occurence as value;
        //prefix sum 0 occured at index -1
        map.put(0,-1);
        int maxLength =0;
        for(int i=0;i<a.length;i++){
            int ele = a[i];
            prefixSum+=ele;
            int rem = prefixSum%k;
            //If the remainder of sum%k is negative than than add k to the remainder
            if(rem<0)rem+=k;
            //If the remainder was already present before than we have got a sutbarray whose sum is divisible by k
            //Update the length by the difference of the current index and the index of first occurence of this remainder
            if(map.containsKey(rem)){
                maxLength = Math.max(maxLength,i-map.get(rem));
            }else{
                map.put(rem,i);
            }
        }
       return maxLength;
    }
 
}
