  '''
  https://www.geeksforgeeks.org/find-the-largest-number-with-given-number-of-digits-and-sum-of-digits/
  '''
  #TC:O(N)
  #SC:O(1)
  def findLargest(self, N, S):
        ans = ''
        currsum = S
        while len(ans)<N:
            if currsum-9 >= 0:
                ans+='9'
                currsum-=9
            else:
                ans+=str(currsum)
                currsum-=currsum
        #If currsum is still left than it means that N digit no. is not
        #sufficient to represent that sum S.We return -1
        if currsum>0:
            return -1
        ans = int(ans)
        #If required sum is zero and no. of digits are greater than 1,than return -1
        #as no number can represent this condition
        if S==0 and N>1:
            return -1
            
        return ans
