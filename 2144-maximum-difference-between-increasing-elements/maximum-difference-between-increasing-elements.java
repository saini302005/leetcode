class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff = -1;

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] > nums[i]){
                    int diff = nums[j] - nums[i];

                    if(diff > maxDiff){
                        maxDiff = diff;
                    }
                }
            }
        }
        return maxDiff;
    }
}