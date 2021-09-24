//https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1#
   
  //TC:O(n)
  //SC:O(n)

class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
       
        Stack<Character> stack =  new Stack<>();
        for(char c : x.toCharArray()){
            if(c == '(' || c == '{' || c == '[')stack.push(c);
            else{
                // If closing bracket is seen and stack is empty then There is no bracket to match to.Therefore return False
                 if(stack.isEmpty())return false;
                //If the top element of stack matches with the incoming bracket 
                 else if(c==')' && stack.peek()=='(')stack.pop();
                 else if(c=='}' && stack.peek()=='{')stack.pop();
                 else if(c==']' && stack.peek()=='[')stack.pop();
                //If it dosent match.Than the top element cannot be matched further.
                 else{
                     return false;
                 }
            }
        
        }
        //If there are some unmatched elements still in stack,return False
        return stack.isEmpty();
    }
}

