//https://practice.geeksforgeeks.org/problems/length-of-the-longest-substring3036/1#

//Maintain a map of characters and their last occuring indices
//If a new character is equal to some previously occuring character and the previousy occuring character falls within the current substring
//Update the length and move the start of my substring to previously occuring character index + 1

class Solution{
    int longestUniqueSubsttr(String S){
        HashMap<Character,Integer> map = new HashMap<>();
        int maxLength = Integer.MIN_VALUE;
        int start = 0;
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(map.containsKey(c) && map.get(c)>=start){
                int length = i - start;
                maxLength = Math.max(maxLength,length);
                start = map.get(c)+1;
            }
            map.put(c,i);
        }
        maxLength = Math.max(maxLength,S.length()-start);
        return maxLength;
    }
}
