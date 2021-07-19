//https://www.youtube.com/watch?v=uuE2pEjLiEI
//TC:O(len(s))
//SC:O(1)
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(bBrackets(str));
}
    public static boolean bBrackets(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==')'||ch=='}'||ch==']'){
                if(st.size()>0){
                    if(ch==')' && st.peek()!='('){
                        return false;
                    }else if(ch=='}' && st.peek()!='{'){
                        return false;
                    }else if(ch==']' && st.peek()!='['){
                        return false;
                    }
                    st.pop();
                }else{
                    return false;
                }
            }else if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }else{
                continue;
            }
        }
        if(st.size()==0){
            return true;
        }else{
           return false; 
        }
    }

}
