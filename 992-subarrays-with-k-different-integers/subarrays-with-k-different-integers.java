class Solution {
    static int atmost(int[] nums, int k){
        int left = 0;
        int right = 0;
        int count = 0;

        Map<Integer, Integer> map = new HashMap();

        while(right < nums.length){
            map.put(nums[right],map.getOrDefault(nums[right], 0) + 1);

            while(map.size() > k){
                int val = nums[left];
                int c = map.get(val);
                c--;

                if(c == 0){
                    map.remove(nums[left]);
                } else {
                    map.put(val, c);
                }
                left++;
            }
            count += right - left;
            right++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums, k) - atmost(nums, k - 1);
    }
}