class Solution:
    def findNumbers(self, nums: list[int]) -> int:
        ans = 0

        for i in range(len(nums)):
            num = nums[i]
            digits = 0

            while num > 0:
                digits += 1
                num = num // 10

            if digits % 2 == 0:
                ans += 1

        return ans