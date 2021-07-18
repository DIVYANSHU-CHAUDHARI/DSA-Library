//Approach1
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
    //System.out.println(Arrays.toString(arr));
    int k = Integer.parseInt(br.readLine());
    int[] ngr = new int[arr.length];
    
    //Step1:Build up next greater element on the right array
    
    Stack<Integer> stk = new Stack<>();
    for(int i=arr.length-1;i>=0;i--){
        //Pop elements which are less than the current element
        while(stk.size()>0 && arr[stk.peek()]<arr[i]){
            stk.pop();
        }
        //update ans
        if(stk.size()==0){
            ngr[i] = arr.length;
        }else{
            ngr[i] = stk.peek();
        }
        //push current index in stack
        stk.push(i);
    }

    //Main code

    for(int i=0,j=0;i<=ngr.length-k;i++){
      //Agar j piche choot jata hai i se toh barabar leke aao
        if(j<i){
            j=i;
        }
        //till j is in range of current window
        while(ngr[j]<i+k){
            j = ngr[j];
        }
        System.out.println(arr[j]);
    }
    
 }
}
