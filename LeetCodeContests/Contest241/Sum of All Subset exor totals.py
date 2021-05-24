import itertools
class Solution:
    def XorVal(self,subset):
        xor = 0
        for element in subset:
            xor^=element
        return xor
    
    def subsetXORSum(self, nums: List[int]) -> int:
        subsets = []
        sm = 0
        for i in range(len(nums)+1):
            subsets+=itertools.combinations(nums,i)
        for element in subsets:
            sm+=self.XorVal(element)
        return sm
        
