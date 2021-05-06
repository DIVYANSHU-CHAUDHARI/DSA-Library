  '''
  https://practice.geeksforgeeks.org/problems/minimum-indexed-character-1587115620/1#
  '''
  #TC:O(n^2)
  def minIndexChar(self,str, pat): 
        minInd = float('inf')
        for i in range(len(pat)):
            if pat[i] in set(str):
                minInd = min(str.index(pat[i]),minInd)
        return minInd
      
      
      
#Best approach
'''
1.Create a hash table with (key, value) tuple represented as (character, index) tuple.
2.Store the first index of each character of str in the hash table.
3.Now, for each character of patt check if it is present in the hash table or not. 
4.If present then get its index from the hash table and update minIndex(minimum index encountered so far).
5.For no matching character print “No character present”.
'''

    #Function to find the minimum indexed character.
    def minIndexChar(self,str, pat): 
        hashmap = {}
        minInd = float('inf')
        
        #Make a hashmap with elements as key and first occurence index
        #of those elements as value
        for i in range(len(str)):
            if str[i] not in hashmap:
                hashmap[str[i]] = i
        #Check for the element in pat which has the lowest index in str   
        for ele in pat:
            if ele in hashmap and hashmap[ele]<minInd:
                minInd = hashmap[ele]
    
        return minInd
