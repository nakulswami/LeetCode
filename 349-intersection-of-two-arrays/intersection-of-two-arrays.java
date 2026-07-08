class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        for (int x : nums1) s.add(x);

        Set<Integer> ans = new HashSet<>();
        for (int x : nums2)
            if (s.contains(x)) ans.add(x);

        return ans.stream().mapToInt(i -> i).toArray();
    }
}