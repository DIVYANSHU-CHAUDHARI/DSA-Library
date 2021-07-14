//https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
//https://www.youtube.com/watch?v=Givpwgu9IIc
/*
Intuition
To make the string valid with minimum removals, we need to get rid of all parentheses that do not have a matching pair.

Push char index into the stack when we see '('.

Pop from the stack when we see ')'.

If the stack is empty, then we have ')' without the pair, and it needs to be removed.
In the end, the stack will contain indexes of '(' without the pair, if any. We need to remove all of them too.

Update: check out the new approach 2 that collects indexes of all mismatched parentheses, and removes them right-to-left.
*/
class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] sarr = new char[s.length()];
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            sarr[i] = s.charAt(i);
        }
        Stack<Integer> stack =new Stack<Integer>();
        for(int i=0;i<sarr.length;i++){
            //Push index of '(' into the stack whenever found
            if(sarr[i]=='('){
                stack.push(i);
            //Replace ')' with '*' for every unmatched ')'
            }else if(sarr[i]==')' && stack.isEmpty()){
                sarr[i] = '*';
            //Pop a '(' index for every ')' occurence
            }else if(sarr[i]==')' && (!stack.isEmpty())){
                stack.pop();
            }else {
                continue;
            }
        }
        //Stack now contains index of every unmatched '('.Replace '(' with '.' in arr.
        while(!stack.isEmpty()){
            sarr[stack.pop()] = '*';
        }
    
        for(char ele:sarr){
            if(ele != '*'){ 
                sb.append(ele);
            }
        }
        System.out.println(sarr.toString());
        return sb.toString();
    }
}
