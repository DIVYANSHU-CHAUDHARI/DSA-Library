"""
https://practice.geeksforgeeks.org/problems/remove-duplicates3034/1#
"""
class Solution {
    String removeDups(String S) {
        Set<Character> charSet = new LinkedHashSet<>();
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            charSet.add(c);
        }
        String result = "";
        for(char c:charSet){
            result+=c;
        }
        return result;
        
    }
}
