  """
  https://www.geeksforgeeks.org/leaders-in-an-array/
  """
  #Most Efficient Algorithm
    
    #TC: O(n)
    #SC: O(1)
    """
    Scan all the elements from right to left in an array and keep track of maximum till now. When maximum changes its value, print it
    """
    def leaders(self, A, N):
        maxVal = float('-inf')
        result = []
        for i in range(N-1,-1,-1):
            if A[i]>=maxVal:
                result.append(A[i])
                maxVal = A[i]
        return result[::-1]
