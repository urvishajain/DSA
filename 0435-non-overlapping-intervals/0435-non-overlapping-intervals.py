class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        intervals.sort(key=lambda x: x[1])
        n=len(intervals)
        print(intervals)
        cnt=0
        e=float('-inf')
        for i in range(n):
            if e>intervals[i][0]:
                cnt+=1
            else:
                e=intervals[i][1]
        
        return cnt 
        
        
        