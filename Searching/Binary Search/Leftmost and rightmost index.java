//https://practice.geeksforgeeks.org/problems/find-first-and-last-occurrence-of-x0849/1#
//TC:O(logn)
//SC:O(1)
/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    
    public pair indexes(long v[], long x)
    {
        long leftInd = -1;
        long rightInd = -1;
        pair result = new pair(leftInd,rightInd);
        int left = 0;
        int right = v.length-1;
        
        
        while(left<=right){
            int mid = (left+(right-left)/2);
            if(v[mid]==x){
                right = mid-1;
                leftInd = mid;
            }else if(v[mid]>x){
                right = mid-1;
            }else{
                left = mid+1;
            }
            
        }
        
        result.first = leftInd;
        left = 0;
        right = v.length-1;
        
        while(left<=right){
            int mid = (left+(right-left)/2);
            if(v[mid]==x){
                left = mid+1;
                rightInd = mid;
            }else if(v[mid]>x){
                right = mid-1;
            }else{
                left = mid+1;
            }
            
        }
        result.second = rightInd;
        return result;
    }
}
