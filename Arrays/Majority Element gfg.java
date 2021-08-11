//Approach1:
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
//Using hashmap
//TC:O(n)SC:O(n)
class Solution
{
    static int majorityElement(int a[], int size)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = a.length;
        int majorityCount = n/2;
        int candidate = -1;
        for(int ele:a){
            if(!map.containsKey(ele)){
                map.put(ele,1);
            }else{
                map.put(ele,map.get(ele)+1);
            }
            if(map.get(ele)>majorityCount){
                candidate = ele;
                break;
            }
        }
        return candidate;
        
    }
}

//Most efficient Approach: This is a two-step process. 
//TC:O(n) SC:O(1)
//1.The first step gives the element that maybe the majority element in the array. 
//If there is a majority element in an array, then this step will definitely return majority element, 
//otherwise, it will return candidate for majority element.
//2.Check if the element obtained from the above step is majority element. This step is necessary as there might be no majority element.

class Solution
{
    static int majorityElement(int a[], int size)
    {
        int n = a.length;
        int count = 0;
        int candidate = 0;
        for(int ele:a){
            if(count==0){
                candidate = ele;
                count++;
            }else if(ele==candidate){
                count++;
            }else{
                count--;
            }
            
        }
        int freq = 0;
        for(int ele:a){
            if(ele==candidate)freq++;
        }
        if(freq>n/2)return candidate;
        return -1;
    
}
}
