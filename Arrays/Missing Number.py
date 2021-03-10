"""
https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1#
"""
#1.Missing number
#-->Approach 1 (Sum formula):

def MissingNumber(array,n):
    totalSum = ((n)*(n+1))//2
    return totalSum-sum(array)

#-->Approach 2 (Hashing):

def MissingNumber(array,n):

    numberDict = {i:False for i in range(1,len(array)+2)}
    for element in array:
        if element in numberDict.keys():
            numberDict[element] = True
    for key,value in numberDict.items():
        if value == False:
            return key

#-->Approach 3 (Xor method):

def getMissingNo(a, n):
    x1 = a[0]
    x2 = 1
    for i in range(1,len(a)):
        x1 = x1^a[i]
    for j in range(2,len(a)+2):
        x2 = x2^j

    return x1^x2
