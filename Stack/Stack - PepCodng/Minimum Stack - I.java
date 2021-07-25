//https://classroom.pepcoding.com/myClassroom/the-switch-program-3/stack-and-queue/minimum-stack-i-official/ojquestion
//Things to note:
//1.Size of both the stacks will be the same at any point.

import java.io.*;
import java.util.*;

public class Main {

  public static class MinStack {
    Stack<Integer> allData;
    Stack<Integer> minData;

    public MinStack() {
      allData = new Stack<>();
      minData = new Stack<>();
    }


    int size() {
      return minData.size();  
    }

    void push(int val) {
      if(allData.size()==0){
          allData.push(val);
          minData.push(val);
      }else{
          allData.push(val);
          minData.push(Math.min(minData.peek(),val));
      }
    }

    int pop() {
      if(allData.size()==0){
          System.out.println("Stack underflow");
          return -1;
      }else{
         minData.pop();
        return allData.pop();   
      }
    }

    int top() {
      if(allData.size()==0){
          System.out.println("Stack underflow");
          return -1;
      }else{
          return allData.peek();
      }
    }

    int min(){
        if(allData.size()==0){
          System.out.println("Stack underflow");
          return -1;
        }else{
          return minData.peek();   
        }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    MinStack st = new MinStack();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("push")){
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if(str.startsWith("pop")){
        int val = st.pop();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("top")){
        int val = st.top();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(st.size());
      } else if(str.startsWith("min")){
        int val = st.min();
        if(val != -1){
          System.out.println(val);
        }
      }
      str = br.readLine();
    }
  }
}
