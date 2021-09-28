//https://practice.geeksforgeeks.org/problems/subarrays-with-sum-k/1/
//https://www.youtube.com/watch?v=20v8zSo2v18

class Solution
{
    static int findSubArraySum(int Arr[], int N, int k)
    {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        //Remember to put frequency of 0 as 1.
        map.put(0,1);
        int prefixSum = 0;
        for(int ele:Arr){
            prefixSum+=ele;
            if(map.containsKey(prefixSum-k)){
              //Count is incremented by the frequency of (prefixSum-k) occuring. and not by 1.
                count+=map.get(prefixSum-k);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        
        return count;
    }
}
