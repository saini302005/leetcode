class Solution(object):
    def runningSum(self, nums):
        result = []
        total = 0

        for num in nums:
            total = total + num
            result.append(total)

        return result

        """
        :type nums: List[int]
        :rtype: List[int]
        """
        