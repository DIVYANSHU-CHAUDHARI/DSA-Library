//https://practice.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem3257/1#
//TC:O(n)
//SC:O(n)
//https://www.youtube.com/watch?v=BvKv-118twg

//Freq. of remainders k/2 should be even.
//Freq of remainders 0 should be even.
//(So that in both cases the elements can pair up with each other)
//Freq. of elements with remainder x = Freq of elements with remainder (k-x)

//if any of the above conditions are false than return false
//Otherwise return true
class Solution {
    public boolean canPair(int[] nums, int k) {
        HashMap<Integer,Integer> rfm = new HashMap<>();
        for(int x:nums){
            int rem = x%k;
            rfm.put(rem,rfm.getOrDefault(rem,0)+1);
        }
        for(int val:nums){
            
            int rem = val%k;
            
            //If the remainder is 0 and its frequency is odd return false
            if(rem==0){
                int fq = rfm.get(rem);
                if(fq%2==1)return false;
            //If the remainder is k/2 and its frequency is odd return false
            }else if(2*rem==k){
                int fq = rfm.get(rem);
                if(fq%2==1)return false;
            }else{
                int fq = rfm.get(rem);
                //GetOrdefault if remainder k-rem is not present in hashmap
                int ofq = rfm.getOrDefault(k-rem,0);
                if(fq!=ofq){
                    return false;
                }
            }
        }
        return true;
    }
}
