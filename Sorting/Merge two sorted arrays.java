//https://classroom.pepcoding.com/myClassroom/the-switch-program-3/time-and-space-complexity/merge-two-sorted-arrays-official/ojquestion
import java.io.*;
import java.util.*;

public class Main {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    
    int[] ans = new int[a.length+b.length];
    
    int i = 0;
    int j = 0 ;
    int k = 0;
    
    while(i<a.length && j<b.length){
        if(a[i]<b[j]){
            ans[k] = a[i];
            i++;
            k++;
        }else{
            ans[k] = b[j];
            j++;
            k++;
        }
    }
    while(i<a.length){
        ans[k] = a[i];
        i++;
        k++;
    }
    while(j<b.length){
        ans[k] = b[j];
        j++;
        k++;
    }
    
    return ans;
  }
