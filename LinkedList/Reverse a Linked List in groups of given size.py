"""
https://www.geeksforgeeks.org/reverse-a-list-in-groups-of-given-size/
"""
#TC:O(n)
#SC:O(n/k) (recursion)
  def reverse(self,head, k):
        if head == None:
            return None
        prev = None
        curr = head
        nxt = None
        count = k
        #reverses the k element Linked list
        while count>0 and curr:
            nxt = curr.next
            curr.next = prev
            prev = curr
            curr = nxt
            count-=1
        #linkage of new lists new head to the next lists new head using recursiom
        if nxt:
            head.next = self.reverse(nxt,k)
        return prev
