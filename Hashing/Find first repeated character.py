#TC:O(N)
#SC:O(N)
def firstRepChar(self, s):
        numDict = {}
        for element in s:
            if element not in numDict:
                numDict[element] = 1
            else:
                return element
        return -1
