class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            int num = nums[i];
            max = Math.max(max, num);
            min = Math.min(min, num);

        }
        for(int num : nums){
            if(num>min && num < max){
                return num;
            }
        }
        return -1;
    }
}