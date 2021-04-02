'''
https://practice.geeksforgeeks.org/problems/stack-using-two-queues/1#
'''

#Function to push an element into stack using two queues.

#Approach:
#push(s, x) operation's
#1.Push the element(Enqueue) into queue2
#2.One by one dequeue elements from queue1 and enqueue in queue1
#3.Swap the names of q1 and q2

#Swapping other approach:
#queue_1,queue_2=queue_2,queue_1

#Note : When you pop the element you pop ie remove it and not return its value only.

def push(x):
    
    # global declaration
    global queue_1
    global queue_2
    
    queue_2.append(x)
    while queue_1:
        queue_2.append(queue_1[0])
        queue_1.pop(0)
    temp = queue_1
    queue_1 = queue_2
    queue_2 = temp
    


#Function to pop an element from stack using two queues.     
def pop():
    
    # global declaration
    global queue_1
    global queue_2
    if queue_1:
        return queue_1.pop(0)
    return -1
