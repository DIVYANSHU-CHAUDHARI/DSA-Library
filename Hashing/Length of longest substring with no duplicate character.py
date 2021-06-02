  '''
  https://practice.geeksforgeeks.org/problems/length-of-the-longest-substring3036/1/?track=md-hashing&batchId=144
  https://leetcode.com/problems/longest-substring-without-repeating-characters/
  '''
  '''
  Explanation : https://leetcode.com/problems/longest-substring-without-repeating-characters/discuss/347818/Python3%3A-sliding-window-O(N)-with-explanation
  '''
  #Approach1:
  #Brute force : TC: O(n^3)
  #Approach2:
  #My solution
  #TC:O(|S|)
  #SC:O(|S|)
  def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s)==1:return 1
        if len(s)==0 :return 0
        characters = {}
        max_len = 0
        start = 0
        for i in range(len(s)):
            if s[i] not in characters:
                characters[s[i]] = i
            elif characters[s[i]]<start:
                characters[s[i]] = i
            else:
                max_len = max(i-start,max_len)
                start=characters[s[i]]+1
                characters[s[i]] = i
        curr_len = i-start+1
        max_len = max(curr_len,max_len)   
        return max_len
   #This code can be rewritten as below.Exactly the complement of the above code with lesser lines
  def lengthOfLongestSubstring(self, s):
        start = maxLength = 0
        usedChar = {}
        
        for i in range(len(s)):
            if s[i] in usedChar and start <= usedChar[s[i]]:
                start = usedChar[s[i]] + 1
            else:
                maxLength = max(maxLength, i - start + 1)

            usedChar[s[i]] = i

        return maxLength
