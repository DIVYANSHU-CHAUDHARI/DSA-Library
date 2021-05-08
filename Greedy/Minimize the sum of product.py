'''
https://practice.geeksforgeeks.org/problems/minimize-the-sum-of-product1525/1#
'''
    def minValue(self, a, b, n):
        a.sort()
        b.sort(reverse = True)
        sumval = 0
        for i in range(n):
            sumval+=a[i]*b[i]
        return sumval
