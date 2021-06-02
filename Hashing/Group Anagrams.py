'''
https://practice.geeksforgeeks.org/problems/print-anagrams-together/1/?track=md-hashing&batchId=144#
'''
#see SF solution

#TC:O(nmlogm)where n is the no. of words and m is the maximum size of a word
#SC:O(nm)
def Anagrams(words,n):
    '''
    words: list of word
    n:      no of words
    return : list of group of anagram {list will be sorted in driver code (not word in grp)}
    '''
    myDict = defaultdict(list)
    for word in words:
            myDict[tuple(sorted(word))].append(word)
    return [v for k,v in myDict.items()]
 '''
 In the previous approach, we were sorting every string in order to maintain a similar key, 
 but that cost extra time in this approach will take the advantage of another hashmap to maintain the frequency of the characters which 
 will generate the same hash function for different string having same frequency of characters.
 '''

#TC:O(nm) where n is the no. of words and m is the maximum size of a word
#SC:O(n+k) where k is 26 
 def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram = collections.defaultdict(list)
        for word in strs:
            count = [0]*26
            for c in word:
                count[ord(c)-ord('a')]+=1
            anagram[tuple(count)].append(word)
        return anagram.values()
