class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> obj:map.entrySet()){
            if(obj.getValue() > nums.length/2){
                return obj.getKey();
            }
        }
        return 0;
    }
}