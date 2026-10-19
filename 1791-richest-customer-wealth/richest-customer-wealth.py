class Solution(object):
    def maximumWealth(self, accounts):
        maxwealth = 0

        for i in range(len(accounts)):
            wealth = 0

            for j in range(len(accounts[i])):
                wealth = wealth + accounts[i][j]

            maxwealth = max(maxwealth, wealth)

        return maxwealth
        """
        :type accounts: List[List[int]]
        :rtype: int
        """
        