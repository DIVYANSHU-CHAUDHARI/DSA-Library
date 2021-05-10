  '''
  https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1#
  '''
  #TC:O(N)
  #SC:O(1)
  
  #algorithm
  #array - 1,2,3,4,5 rotate left by 2 to give 3,4,5,1,2
  #Step1 : Reverse : 5,4,3,2,1
  #Step2 : Reverse last D elements: 5,4,3,1,2
  #Step3: Reverse remaining elements: 3,4,5,1,2
  
  def rotateArr(self,A,D,N):
        D = D%N
        self.reverse(A,0,N-1)
        self.reverse(A,N-D,N-1)
        self.reverse(A,0,N-D-1)
        return A
    def reverse(self,A,start,end):
        while start<end:
            temp = A[start]
            A[start] = A[end]
            A[end] = temp
            start+=1
            end-=1
