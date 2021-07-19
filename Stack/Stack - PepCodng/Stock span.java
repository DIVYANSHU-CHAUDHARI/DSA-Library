//https://www.youtube.com/watch?v=0BsPlzqksZQ
//TC:O(n)
//SC:O(1)
//Time complexity is calculated by how many times an element is traversed.
//Here every element is pushed and poped 2 times.
import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    
    int[] span = solve(a);
    display(span);
 }

 public static int[] solve(int[] arr){
   Stack<Integer> st = new Stack<>();
   int[] ngl  = new int[arr.length];
   int[] ans = new int[arr.length];
   for(int i=0;i<arr.length;i++){
       while(st.size()>0 && arr[st.peek()]<arr[i]){
           st.pop();
       }
       if(st.size()==0){
           ngl[i] = -1;
       }else{
           ngl[i] = st.peek();
       }
       st.push(i);
   }
   //arr[] = [2,3,1,5,4,6]
   //ngl[] = [-1,-1,1,-1,3,-1]
   //ans[] = [1,2,1,3,1,5]
   for(int i=0;i<ngl.length;i++){
       if(ngl[i]!=-1){
           ans[i] = i-ngl[i];
       }else{
          ans[i] = i+1; 
       }
   }
   return ans;
 }

}
