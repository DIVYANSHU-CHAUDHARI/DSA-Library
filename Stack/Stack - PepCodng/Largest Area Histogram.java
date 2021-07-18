//https://classroom.pepcoding.com/myClassroom/the-switch-program-3/stack-and-queue/lah-official/ojquestion

import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }
    //Formula is Max(arr[i]*(nsr - nsl - 1))
    //nsr - next smaller right
    //nsl - next smaller left
    //No next smaller left present  => nsl[i] = -1
    //No next smaller right present  => nsr[i] = arr.length
    
    int min1 = arr[0];
    int[] nsl = new int[arr.length];
    int[] nsr = new int[arr.length];
    Stack<Integer> stk = new Stack<>(); 
    for(int i=nsr.length-1;i>=0;i--){
        //Step1:Pop elements from stack which are greater than current element
        while(stk.size()>0 && arr[stk.peek()]>=arr[i]){
            stk.pop();
        }
        //Step2:update ans
        if(stk.size()==0){
            nsr[i] = arr.length;
        }else{
            nsr[i] = stk.peek();
        }
        stk.push(i);
    }
    stk = new Stack<>();
    for(int i=0;i<nsl.length;i++){
        //Step1:Pop elements from stack which are greater than current element
        while(stk.size()>0 && arr[stk.peek()]>=arr[i]){
            stk.pop();
        }
        //Step2:update ans
        if(stk.size()==0){
            nsl[i] = -1;
        }else{
            nsl[i] = stk.peek();
        }
        stk.push(i);
    }
    
    int maxArea = 0;
    for(int i=0;i<arr.length;i++){
        maxArea = Integer.max(maxArea,arr[i]*(nsr[i]-nsl[i]-1));
    }
    // System.out.println(Arrays.toString(nsl));
    // System.out.println(Arrays.toString(nsr));
    System.out.println(maxArea);
  
    
 }
}
