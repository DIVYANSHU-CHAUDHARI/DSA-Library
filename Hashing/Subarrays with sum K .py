#TC:O(n)
#SC:O(n)

class Solution:
    def findSubArraySum(self, Arr, N, k):
        #A Dictionary is maintained which stores the sums seen till now from the 
        #starting index till the current index and their frequencies
        sumDict = defaultdict(lambda:0)
        sumDict[0] = 1
        currsum = 0
        sumCount = 0
        for element in Arr:
            currsum+=element 
            if currsum-k in sumDict:
                sumCount+=sumDict[currsum-k]
            #Not doing sumDict[currsum] = 1 because the currsum could have been occured before also,
            #So,I just have to increment its count by 1,otherwise the default value is 0 and if its the first occurence of the currsum
            #Its occurence will become 1
            sumDict[currsum]+=1
        return sumCount
