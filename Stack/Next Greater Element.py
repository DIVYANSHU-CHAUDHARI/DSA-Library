'''
https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1#
https://www.youtube.com/watch?v=NXOOYYwpbg4
'''
    
    #TC:O(n)
    #SC:O(n)
    def nextLargerElement(self,arr,n):
        nextGreaterList = []
        stack = []
        for i in range(len(arr)-1,-1,-1):
          #Basically 3 conditions can happen
          #Condition 1 : If the stack is empty means there is no right array.That means we have to append -1 for this element.
            if len(stack) == 0:
                nextGreaterList.append(-1)
          #Condition 2 : If top of stack is greater than the ith element than the top element is the next greater of the array element
            elif arr[i] < stack[-1]:
                nextGreaterList.append(stack[-1])
          #Condition 3: If the top element is less, we pop till we get an element greater than the ith element or when the stack is empty.
                        #Empty stack signifies that there is no element greater than the ith element in its right array.
            elif arr[i]>stack[-1]:
                while len(stack)>0 and arr[i]>stack[-1]:
                    stack.pop()
                #If loop broke because stack got emptied.
                if len(stack) == 0:
                    nextGreaterList.append(-1)
                #If loop broke because we foound element greater than the ith array element
                else:
                    nextGreaterList.append(stack[-1])
            
            stack.append(arr[i])
        return nextGreaterList[::-1]
