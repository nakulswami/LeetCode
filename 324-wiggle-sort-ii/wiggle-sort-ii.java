class Solution {
    public void wiggleSort(int[] nums) {
        int[] b = nums.clone();
        Arrays.sort(b);
        int j = nums.length -1;

        for(int i = 1; i < nums.length; i += 2) nums[i] = b[j--];
        for(int i = 0; i < nums.length; i += 2) nums[i] = b[j--];
    }
}