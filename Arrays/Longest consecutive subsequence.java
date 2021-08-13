//https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1
//TC:O(n)
//SC:O(n)
class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   //hashmap will give me the information about which elements of the array are the starting of the sequence
	   //that can be formed from the elements of the array and which elements cannot be the starting point
	   HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
	   //stores the length of maximum consecutive sequence
	   int maxlen = 0;
	   //Store every element as key and true as value assuming that every element can be the starting of the sequence
	   for(int ele:arr)map.put(ele,true);
	   //We make those elements false whose previous element is present in the array
	   //indicating that the current element cannot be the starting of the sequence
	   for(int ele:map.keySet()){
	       if(map.containsKey(ele-1))map.put(ele,false);
	   }
	   //For every element that is the starting of the sequence,count the maximum length of consecutive
	   //sequence that can be formed taking the current element as the starting.
	   for(int ele:map.keySet()){
	       if(map.get(ele)==true){
	           int len = 1;
	           int temp = ele+1;
	           while(map.containsKey(temp)){
	               len++;
	               temp = temp+1;
	           }
	           maxlen = Math.max(maxlen,len);
	       }
	   }
	   //return the maximum length consecutive sequence
	   return maxlen;
	}
}
