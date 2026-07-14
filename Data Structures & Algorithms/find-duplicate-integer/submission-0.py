class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        for i, num in enumerate(nums):
            if num in nums[:i]:
                return num