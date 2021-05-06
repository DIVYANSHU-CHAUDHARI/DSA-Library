'''
https://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1#
'''

def allPairs(self, A, B, N, M, X):
        A = set(A)
    #Converting into a set because lookup in set is O(1) TC
        result = []
        for ele in B:
            if (X - ele) in A:
                result.append([X-ele,ele])
        return sorted(result,key = lambda x:x[0])
