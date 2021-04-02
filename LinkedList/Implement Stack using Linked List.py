# Class to represent a node
class StackNode:

	# Constructor to initialize a node
	def __init__(self, data):
		self.data = data
		self.next = None


class Stack:

    def __init__(self):
        self.head=None
    # The method push to push element into
    # the stack
    def push(self, data):
        newNode=StackNode(data)
        if self.head is None:
            self.head=newNode
        else:
            newNode.next=self.head
            self.head=newNode
    
    def pop(self):
        if self.head is None:
            return(-1)
        temp=self.head
        self.head=temp.next
        temp.next=None
        return(temp.data)
