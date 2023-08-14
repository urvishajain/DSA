class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        import heapq as h
        l=[]
        h.heapify(l)
        for x in nums:
            h.heappush(l,x)
            if len(l)>k:
                h.heappop(l)
        return h.heappop(l)
        