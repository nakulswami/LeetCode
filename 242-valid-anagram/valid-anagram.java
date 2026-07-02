class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        // Count characters in s
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Decrease count using t
        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch)) {
                return false;
            }

            int count = map.get(ch) - 1;

            if (count == 0) {
                map.remove(ch);
            } else {
                map.put(ch, count);
            }
        }

        return map.isEmpty();
    }
}