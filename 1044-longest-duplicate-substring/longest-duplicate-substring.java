import java.util.*;

class Solution {
    static long base = 26;
    static long mod = (1L << 31) - 1;

    private String search(String s, int len) {
        if (len == 0) return "";

        long hash = 0;
        long power = 1;

        for (int i = 1; i < len; i++) {
            power = (power * base) % mod;
        }

        for (int i = 0; i < len; i++) {
            hash = (hash * base + (s.charAt(i) - 'a')) % mod;
        }

        Map<Long, List<Integer>> map = new HashMap<>();
        map.put(hash, new ArrayList<>());
        map.get(hash).add(0);

        for (int i = len; i < s.length(); i++) {

            hash = (hash - (s.charAt(i - len) - 'a') * power % mod + mod) % mod;

            hash = (hash * base + (s.charAt(i) - 'a')) % mod;

            int start = i - len + 1;

            if (map.containsKey(hash)) {
                for (int prev : map.get(hash)) {
                    if (s.substring(prev, prev + len)
                            .equals(s.substring(start, start + len))) {
                        return s.substring(start, start + len);
                    }
                }
            }

            map.computeIfAbsent(hash, k -> new ArrayList<>()).add(start);
        }

        return null;
    }

    public String longestDupSubstring(String s) {
        int left = 1;
        int right = s.length() - 1;

        String ans = "";

        while (left <= right) {
            int mid = left + (right - left) / 2;

            String temp = search(s, mid);

            if (temp != null) {
                ans = temp;
                left = mid + 1; // try longer substring
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}