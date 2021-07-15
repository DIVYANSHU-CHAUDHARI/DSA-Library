//https://leetcode.com/problems/group-anagrams/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length==0)return new ArrayList<>();
        HashMap<String,ArrayList<String>> map= new HashMap<>();
        for(String s:strs){
            char[] fa = new char[26];
            for(char c:s.toCharArray()){
                fa[c-'a']++;
            }
            String keyString = String.valueOf(fa);
            if(!map.containsKey(keyString)){
                map.put(keyString,new ArrayList<>());
            }
            map.get(keyString).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
