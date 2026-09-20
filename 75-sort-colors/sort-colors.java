class Solution {
    public void sortColors(int[] nums) {
        int max = nums[0];
        for(int i = 0; i<nums.length; i++){
                if(nums[i]>max){
                    max = nums[i];
                }
        }
        int count[] = new int [max+1];
        for(int i = 0; i<nums.length; i++){
            count[nums[i]]++;
        }
        int index = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i]>0){
                nums[index]=i;
                index++;
                count[i]--;
            }
        }
    }
}