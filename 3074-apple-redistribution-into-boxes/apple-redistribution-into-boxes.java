class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int total = 0;
        for(int ele:apple){
            total += ele;
        }
        int count = 0;
        for(int i = capacity.length - 1; i>= 0; i--){
            total = total - capacity[i];
            count++;

            if(total <= 0){
                return count;
            }
        }
        return count;
    }
}