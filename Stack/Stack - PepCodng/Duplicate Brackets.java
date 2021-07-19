//https://www.youtube.com/watch?v=aMPXhEdpXFA
//TC:O(len(S))
//SC:O(1)
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == ')'){
               if(st.size()>0 && st.peek()=='('){
                   System.out.println(true);
                   return;
               }else{
                   while(st.size()>0 && st.peek()!='('){
                       st.pop();
                   }
                   st.pop();
               } 
            }else{
                st.push(ch);
            }
        }
       
        System.out.println(false);
    }

}
