import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    System.out.println(infix(exp));
 }
 
 public static int infix(String str){
     Stack<Integer> operand = new Stack<>();
     Stack<Character> operator = new Stack<>();
     for(int i=0;i<str.length();i++){
         char ch = str.charAt(i);
         if(ch>='0' && ch<='9'){
             operand.push(ch-'0');
         }else if(ch=='('){
             operator.push(ch);
         }else if(ch==')'){
             while(operator.peek()!='('){
                 char oprtr = operator.pop();
                 int op2 = operand.pop();
                 int op1 = operand.pop();
                 int ans = solve(oprtr,op1,op2);
                 operand.push(ans);
             }
           //Popping ) closing brackets
             operator.pop();
         }else if(ch=='*' || ch=='-' || ch=='/' ||ch=='+'){
             if(operator.size()>0 && precedence(operator.peek())>=precedence(ch)){
                 char oprtr = operator.pop();
                 int op2 = operand.pop();
                 int op1 = operand.pop();
                 int ans = solve(oprtr,op1,op2);
                 operand.push(ans);
             }
             operator.push(ch);
         }
     }
    while(operator.size()!=0){
            char oprtr = operator.pop();
            int op2 = operand.pop();
            int op1 = operand.pop();
            int ans = solve(oprtr,op1,op2);
            operand.push(ans);
         
     }
   
     return operand.pop();
 }
 
 public static int solve(char oprtr,int op1,int op2){
     if(oprtr=='*'){
         return op1*op2;
     }else if(oprtr=='/'){
         return op1/op2;
     }else if(oprtr=='+'){
         return op1+op2;
     }else if(oprtr=='-'){
         return op1-op2;
     }
     return 0;
 }
 
 public static int precedence(char ch){
     if(ch=='*' || ch=='/'){
         return 2;
     }else if(ch=='-' || ch=='+'){
         return 1;
     }else{
         return 0;
     }
 }
}
