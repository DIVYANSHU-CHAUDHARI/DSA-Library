//https://leetcode.com/problems/top-k-frequent-elements/
//TC:O(n)
//SC:O(n)
class Solution {
    public int[] topK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        //Step1.Creating Frequency map of all the integers of the array
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        //Step2.Create a priority queue of elements maintaining its size as k and priority of elements based on 
        //how higher their frequency
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(a)-map.get());
        
        for(int x:map.keySet()){
            pq.add(x);
            if(pq.size()>k){
                pq.poll();
            }
        }
        //Finally the priority queue contains the top k elements based on frequencies
        int[] result = new int[k];
        int i = 0;
        //Fill all the elements in an array and return;
        while(!pq.isEmpty()){
            result[i++] = pq.poll();
        }
        return result;
        
    }
}
