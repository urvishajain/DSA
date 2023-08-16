class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        n=len(nums)
        ans=[]
        que=[]
        for i in range(n):
            
            while(len(que)>0 and nums[i]>nums[que[-1]]):
                que.pop()
            que.append(i)
            if i>=(k-1):
                ans.append(nums[que[0]])
                if nums[que[0]]==nums[i-k+1]:
                    que.pop(0) 
        return ans 
    
    
            
                
            
        