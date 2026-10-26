class Solution:
    def sumOddLengthSubarrays(self, arr: list[int]) -> int:
        total = 0

        for start in range(len(arr)):
            for end in range(start, len(arr)):
                length = end - start + 1

                if length % 2 == 1:
                    subarray_sum = 0

                    for i in range(start, end+1):
                        subarray_sum += arr[i]

                    total += subarray_sum

        return total