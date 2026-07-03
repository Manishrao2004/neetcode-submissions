class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        res=[]
        for x in range(0, len(nums)-k+1):
            res.append(max(nums[x:x+k]))
    
        return res