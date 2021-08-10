//https://www.youtube.com/watch?v=vF7gk4iaklA
//Slight variation after finding the smallest element index
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = {5,6,7,1,2,3,4};
        int lo = 0;
        int hi = arr.length-1;
        while(lo<hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>arr[hi]){
                lo = mid+1;
            }else{
                hi = mid;
            }
        }
        if(lo>=1){
            System.out.println(arr[lo-1]);
        }else{
            System.out.println(arr[arr.length-1]);
        }
       
    }
}
