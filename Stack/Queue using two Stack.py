'''
https://practice.geeksforgeeks.org/problems/queue-using-two-stacks/1
https://coderbyte.com/algorithm/implement-queue-using-two-stacks
'''
#TC:O(n)
#SC:O(n)

def Push(x,stack1,stack2):
    stack1.append(x)
#Function to pop an element from queue by using 2 stacks.
def Pop(stack1,stack2):
    if len(stack2)==0:
        if len(stack1)==0:return -1
        while len(stack1)>0:
            element = stack1.pop()
            stack2.append(element)
    return stack2.pop()
