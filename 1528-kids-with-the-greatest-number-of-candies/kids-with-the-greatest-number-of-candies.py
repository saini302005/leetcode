class Solution:
    def kidsWithCandies(self, candies: list[int], extraCandies: int) -> list[bool]:
        max_candies = candies[0]

        for i in range(1, len(candies)):
            if candies[i] > max_candies:
                max_candies = candies[i]
        ans = []
        for i in range(len(candies)):
            if candies[i] + extraCandies >= max_candies:
                ans.append(True)
            else:
                ans.append(False)

        return ans