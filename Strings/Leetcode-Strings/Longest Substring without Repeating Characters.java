//https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)return 0;
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0,j=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                //This part is tricky
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}

//Try for eg: abba
