// We track the first and last occurence of each character.

// Then, for each character, we count unique characters between its first and last occurence. 
// That is the number of palindromes with that character in the first and last positions.

// Example: abcbba, we have two unique chars between first and last a (c and b), and two - between first and last b (b and c). 
// No characters in between c so it forms no palindromes.

// For each palindromes in format of "aba",
// we enumerate the character on two side.

// We find its first occurrence and its last occurrence,
// all the characters in the middle are the candidate for the midd char.

class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] first = new int[26];
        int[] last = new int[26];
        int res = 0;
        Arrays.fill(first,Integer.MAX_VALUE);
        for(int i=0;i<s.length();i++){
            first[s.charAt(i)-'a'] = Math.min(first[s.charAt(i)-'a'],i);
            last[s.charAt(i)-'a'] = i;
        }
        for(int i=0;i<26;i++){
            if(first[i]<last[i]){
               res+=s.substring(first[i]+1,last[i]).chars().distinct().count(); 
            }
        }
        return res;
    }
}
