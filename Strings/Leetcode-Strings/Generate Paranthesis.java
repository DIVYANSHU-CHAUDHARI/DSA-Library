//https://www.youtube.com/watch?v=eyCj_u3PoJE
//https://www.youtube.com/watch?v=qBbZ3tS0McI
//https://leetcode.com/problems/generate-parentheses/
class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<String>();
        int ob = n;
        int cb = n;
        StringBuilder output = new StringBuilder("");
        solve(ob,cb,output,ans);
        return ans;
        
    }
    
    public static void solve(int ob,int cb,StringBuilder output,ArrayList<String> ans){
        if(ob==0 && cb==0){
            ans.add(output.toString());
            return;
        }
        if(ob!=0){
            output.append("(");
            solve(ob-1,cb,output,ans);
            output.deleteCharAt(output.length()-1);
        }
        if(cb>ob){
            output.append(")");
            solve(ob,cb-1,output,ans);
            output.deleteCharAt(output.length()-1);
        }
    }
}
