'''
https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1#
'''
    #Function to find the maximum number of meetings that can
    #be performed in a meeting room.
    def maximumMeetings(self,n,start,end):
        meetingTimings = list(zip(start,end))
        meetingTimings.sort(key = lambda x:x[1])
        prevEnd = -1
        count = 0
        for start,finish in meetingTimings:
            if start>prevEnd:
                count+=1
                prevEnd = finish
        return count
                
