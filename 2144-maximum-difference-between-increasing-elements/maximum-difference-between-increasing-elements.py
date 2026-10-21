class Solution(object):
    def maximumDifference(self, nums):
        maxDiff = -1

        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                if nums[j] > nums[i]:
                    diff = nums[j] - nums[i]

                    if diff > maxDiff:
                        maxDiff = diff

        return maxDiff
        