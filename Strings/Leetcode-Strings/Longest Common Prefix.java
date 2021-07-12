//https://www.youtube.com/watch?v=1YQmI7F9dJ0

//TC:O(n) where n is total no. of characters of all the strings
//TC:O(N*M) where N is the no. of strings and M is the the maximum no. of characters in a string
//SC:O(1)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String lcs = "";
        if(strs==null || strs.length==0){
            return lcs;
        }
        int idx = 0;
        for(char c:strs[0].toCharArray()){
            for(int i=1;i<strs.length;i++){
                if(idx>=strs[i].length() || c!=strs[i].charAt(idx)){
                    return lcs;
                }
            }
            lcs+=c;
            idx++;
        }
        return lcs;
    }
}
