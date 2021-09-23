//https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/
class Solution {
    public int minimumLength(String s) {
        int  i = 0 ;
        int j = s.length()-1;
        while(i<j && s.charAt(i)==s.charAt(j)){
            char prefixChar = s.charAt(i); 
            while(i<s.length() && s.charAt(i)==prefixChar){
                i++;
            }
            while(j>=0 && s.charAt(j)==prefixChar){
                j--;
            }
        }
        return i>j?0:j-i+1;
    }
}
