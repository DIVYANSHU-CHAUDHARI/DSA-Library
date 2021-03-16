  """
  https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1#
  """
  
  def spirallyTraverse(self,matrix, r, c): 
        left = 0 #Indicates left boundary
        right = c-1 #Indicates right boundary
        top = 0 #Indicates top boundary
        bottom = r-1 #Indicates bottom boundary
        direction = 0
        result =[]
        while left<=right and top<=bottom:
            
            if direction == 0 :
                for i in range(left,right+1):
                    result.append(matrix[top][i])
            #Traversing the top boundary and incrementing top to point to new top boundary
                top+=1
                direction = 1
            
            elif direction == 1 :
                for i in range(top,bottom+1):
                    result.append(matrix[i][right])
            #Traversing the right boundary and decrementing right to point to new right boundary
                right-=1
                direction = 2
            
            elif direction == 2 :
                for i in range(right,left-1,-1):
                    result.append(matrix[bottom][i])
            #Traversing the bottom boundary and decrementing bottom to point to new bottom boundary
                bottom-=1
                direction = 3
            
            elif direction == 3 :
                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left])
                #Traversing the left boundary and incrementing left to point to new left boundary
                left+=1
                direction = 0
        
        return result
            
