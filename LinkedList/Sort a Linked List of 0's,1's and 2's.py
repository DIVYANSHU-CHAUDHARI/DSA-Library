    #Function to sort a linked list of 0s, 1s and 2s.
    def segregate(self, head):
        #Count array for keeping track of no. of 0's,1's and 2's
        count = [0]*3
        temp = head
        while temp:
            #Note that it is if else and not if if conditions
            if temp.data == 0:count[0]+=1
            elif temp.data == 1:count[1]+=1
            elif temp.data == 2:count[2]+=1
            #Remember to do this
            temp = temp.next
            
        temp= head
        #Changing node values of the original list
        for i in range(len(count)):
            while count[i]:
                temp.data = i
                temp = temp.next
                count[i]-=1
        return head
