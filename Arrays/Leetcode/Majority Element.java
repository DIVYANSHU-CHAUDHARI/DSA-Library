//Brute Force Solution
//TC:O(n2)
//SC:(1)
class Solution {
    public int majorityElement(int[] nums) {
        int majorityCount = nums.length/2;
        for(int num:nums){
            int count = 0;
            for(int elem:nums){
                if(elem==num){
                    count+=1;
                }
            }
            if(count>majorityCount){
                return num;
            }
        }
     return -1;   
    }
}

//More Efficient Solution
//Using HashMap
//TC:O(n)
//SC:O(n)
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int candidate = 0;
        int majorityCount = nums.length/2;
        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                map.put(num,map.get(num)+1);
            }
            if(map.get(num)>majorityCount){
                candidate = num;
                break;
            }
        }
        return candidate;
    }
}

//Most Efficient Approach:Boyer Moore Voting Algorithm
//TC:O(N)
//SC:O(1)
class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for(int num:nums){
            if(count == 0){
                candidate = num;
                count++;
            }else if(num==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}
