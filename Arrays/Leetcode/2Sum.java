//TC:O(n^2)
//SC:O(1)

//Brute Force Approach
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            int first = nums[i];
            for(int j=i+1;j<nums.length;j++){
                int second = nums[j];
                if(first+second == target){
                    result[0] = i;
                    result[1] = j;
                    break;
                }  
            } 
        }
        return result;
    }
}

//Using HashMaps
//TC:O(n)
//SC:O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(map.containsKey(complement) && map.get(complement)!=i){
                return new int[] {i,map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
//Using Hashmaps in 1 forloop
//TC:O(n)
//SC:O(n)

//No need of map.get(complement)!=i condition
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(map.containsKey(complement) ){
                return new int[] {i,map.get(complement)};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
