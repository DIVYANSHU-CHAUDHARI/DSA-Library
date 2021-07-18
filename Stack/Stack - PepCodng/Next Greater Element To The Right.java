//TC:O(n) every element is pushed and poped only twice
//Right to left approach
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

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
   Stack<Integer> st = new Stack<Integer>();
   int[] ans = new int[arr.length];
   for(int i=arr.length-1;i>=0;i--){
       
       //Pop all smaller elements
       while(st.size()>0 && st.peek()<arr[i]){
           st.pop();
       }
       //Update ans
       if(st.size()==0){
           ans[i] = -1;
       }else{
           ans[i] = st.peek();
       }
       
       st.push(arr[i]);
       
   }
    return ans;
 }
}


//Left to right

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

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
   Stack<Integer> st = new Stack<Integer>();
   int[] ans = new int[arr.length];
   st.push(0);
   for(int i=1;i<arr.length;i++){
       while(st.size()>0 && arr[st.peek()]<arr[i]){
           ans[st.pop()] = arr[i];
       }
        st.push(i);
   }
    while(st.size()>0){
        ans[st.pop()] = -1;
    }   
    return ans;
 }
}
