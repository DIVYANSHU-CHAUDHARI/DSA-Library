'''
https://practice.geeksforgeeks.org/problems/get-minimum-element-from-stack/1#
https://www.youtube.com/watch?v=ZvaRHYYI0-4h
'''
#Other approach: https://www.geeksforgeeks.org/design-and-implement-special-stack-data-structure/(Using an extra stack which keeps track of the minimum elements)

#Best Approach
#TC for all 3 functions : O(1)
#SC for all 3 fuctions : O(1)
class stack:
    def __init__(self):
        self.s=[]
        self.minEle=None

    def push(self,x):
        #If the stack is empty.Push the element
        if len(self.s) == 0:
            self.s.append(x)
            self.minEle = x
        elif len(self.s)>0:
            #If the element to be pushed is greater than or equal to min_element,push the element as it is and there is no change in minimum element
            if x>=self.minEle:
                self.s.append(x) 
            #If the element to be pushed is less than minimum element,push 2*x-current_minimum_element on to the stack and not the actual x
            
            elif x<self.minEle:
                self.s.append(2*x-self.minEle)
                self.minEle = x
            

    def pop(self):
        #If the stack is empty return -1 for pop operation
        if len(self.s)==0:return -1
        #If the top stack element is greater than the minimum element.Than directly pop
        if self.s[-1]>=self.minEle:
            return self.s.pop() 
        #If the top element is less than minimum element.That means it is our flag element and the real top element lies in the min_element.
        #So,we have to pop top element and return the minimum element instead.Also update the new minimum element
        elif self.s[-1]<self.minEle:
            prevMinEle = self.minEle
            self.minEle = 2*self.minEle - self.s[-1]
            self.s.pop()
            return prevMinEle
        

    def getMin(self):
        if len(self.s) == 0:return -1
        else:return self.minEle
