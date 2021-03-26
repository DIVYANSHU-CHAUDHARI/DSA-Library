class Node: 
      
    def __init__(self, data): 
        self.data = data 
        self.next = None
        
class MyQueue:
    
    def __init__(self):
        self.head = None
    #Function to push an element into the queue.
    def push(self, item): 
        #If the queue is empty
        if self.head is None:
            self.head = Node(item)
        else:
            temp = self.head
            while temp.next:
                temp = temp.next
            temp.next = Node(item)
    
    
    #Function to pop front element from the queue.
    def pop(self):
        #If the queue is Empty
        if self.head is None:
            return -1
        else:
            temp = self.head
            self.head = self.head.next
            temp.next = None
            return temp.data
         
