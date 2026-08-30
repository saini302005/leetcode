class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer , Integer> first = new HashMap<>();
        Map<Integer , Integer> last = new HashMap<>();
        Map<Integer , Integer> count = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int x = nums[i];

            first.putIfAbsent(x, i);
            last.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);
        }
        int ans = 0;

        for(int x : count.keySet()){
            int occurences = count.get(x);
            int length = last.get(x) - first.get(x) + 1;

            if(occurences == length){
                ans++;
            }
        }
        return ans;
    }
}