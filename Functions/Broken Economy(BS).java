/*TC:O(logn)
SC::O(1)
Approach
Step1:Apply binary search.Parallely update ceiling and floor value as we approach closer to the target value
Step2:If the target value is less than nums[mid],then there is a chance that nums[mid] is the ceiling value.Here, current,ceil = nums[mid] 
      and update right = mid-1;
Step3:If the target value is greater than nums[mid],then there is a chance that nums[mid] is the floor value.Here, current, floor = nums[mid] 
      and update left = mid+1;
Step4:Agar ceil or floor value dosent exist,print -1 for that.
Step4:Print ceil and floor value of value.

*/
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] nums = new int[n];
    for(int i=0;i<n;i++){
        nums[i]=scn.nextInt();
    }
    int target = scn.nextInt();
    
    int ceil = -1;
    int floor = -1;
    int left = 0;
    int right = nums.length-1;
    
    while(left<=right){
        int mid = left + (right-left)/2;
        if(nums[mid]==target){
              ceil = nums[mid];
              floor = nums[mid];
        }else if(target>nums[mid]){
            left = mid+1;
            floor = nums[mid];
        }else{
            right = mid-1;
            ceil = nums[mid];
        }
    }
    if(ceil == floor){
        System.out.println(ceil);
    }else{
        System.out.println(ceil);
        System.out.println(floor);
    }
 }

}
