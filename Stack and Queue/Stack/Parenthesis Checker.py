    '''
    https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1#
    '''
  #TC:O(n)
  #SC:O(n)
  
    def ispar(self,x):
        matchDict = {')':'(','}':'{',']':'['}
        stack = []
        for i in range(len(x)):
            #Checking for closing bracket
            if x[i] in matchDict.keys():
                #If closing bracket is seen and stack is empty then There is no bracket to match to.Therefore return False
                
                if len(stack) == 0:
                    return False
                else:
                    #If the top element of stack matches with the incoming bracket 
                    if stack[-1]==matchDict[x[i]]:
                        stack.pop()
                    #If it dosent match.Than the top element cannot be matched further.
                    else:
                        return False
            #Pushing only open brackets into the stack
            elif x[i] in matchDict.values():
                stack.append(x[i])
                
        if len(stack) == 0:
            return True
        #If there are some unmatched elements still in stack,return False
        return False
