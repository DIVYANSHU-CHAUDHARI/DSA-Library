//TC:O(n)
//SC:O(n)  
//https://www.youtube.com/watch?v=oSYGjIq6ZM4
class Solution
{
	public int longestConsecutive(Node root)
        {
         int[] max = new int[1];
         findLongestConsecutive(root,0,0,max);
         if(max[0]==1)return -1;
         return max[0];
        }
    public void findLongestConsecutive(Node root,int count,int target,int[] max){
        if(root==null){
            return;
        }
        if(root.data==target){
            count++;
        }else{
            count=1;
        }
        max[0] = Math.max(max[0],count);
        findLongestConsecutive(root.left,count,root.data+1,max);
        findLongestConsecutive(root.right,count,root.data+1,max);
    }
}
