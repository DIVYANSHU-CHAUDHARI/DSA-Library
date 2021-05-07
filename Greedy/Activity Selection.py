'''
The greedy choice is to always pick the next activity whose finish time is least among the remaining activities and the start time is more than or equal to the finish time of the previously selected activity. We can sort the activities according to their finishing time so that we always consider the next activity as minimum finishing time activity.
1) Sort the activities according to their finishing time 
2) Select the first activity from the sorted array and print it. 
3) Do the following for the remaining activities in the sorted array. 
…….a) If the start time of this activity is greater than or equal to the finish time of the previously selected activity then select this activity and print it.
'''
'''
https://practice.geeksforgeeks.org/problems/activity-selection-1587115620/1#
'''
    #Function to find the maximum number of activities that can
    #be performed by a single person.
    def activitySelection(self,n,start,end):
        myList = list(zip(start,end))
        myList.sort(key = lambda x:x[1])
        count = 0
        prevEnd = 0
        for k,v in myList:
            if k>=prevEnd:
                count+=1
                prevEnd = v
        return count 
