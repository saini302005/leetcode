class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentCount = 0;
        int maxCount = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                currentCount++;
            }else{
                currentCount = 0;
            }
            if(currentCount > maxCount){
                maxCount = currentCount;
            }
        }
        return maxCount;
    }
}