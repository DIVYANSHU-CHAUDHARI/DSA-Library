"""
https://www.geeksforgeeks.org/efficiently-merging-two-sorted-arrays-with-o1-extra-space/
https://www.youtube.com/watch?v=hVl2b3bLzBw
"""
#Merge without extra space
#Shell sort/gap  method
#TC: O(log(n+m)*(n+m))
#SC:O(1)

#Function to calculate gap for every pass
    def nextGap(self,gap):
 
        if (gap <= 1):
            return 0
        return (gap // 2) + (gap % 2)
 
    #Function to merge the arrays.
    def merge(self,arr1,arr2,n,m):
        gap = n + m
        gap = self.nextGap(gap)
        while gap > 0:

            # comparing elements in
            # the first array.
            i = 0
            while i + gap < n:
                if (arr1[i] > arr1[i + gap]):
                    temp = arr1[i]
                    arr1[i] = arr1[i+gap]
                    arr1[i+gap] = temp

                i += 1

            # comparing elements in both arrays.
            #j = gap - n if gap > n else 0
            j = i+gap-n
            while i < n and j < m:
                if (arr1[i] > arr2[j]):
                    temp = arr1[i]
                    arr1[i] = arr2[j]
                    arr2[j] = temp

                i += 1
                j += 1

            if (j < m):

                # comparing elements in the
                # second array.
                j = 0
                while j + gap < m:
                    if (arr2[j] > arr2[j + gap]):
                        temp = arr2[j]
                        arr2[j] = arr2[j+gap]
                        arr2[j+gap] = temp

                    j += 1

            gap = self.nextGap(gap)
