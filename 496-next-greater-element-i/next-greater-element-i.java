class Solution {
    public int[] nextGreaterElement(int[] a, int[] b) {
        int[] ans = new int[a.length];
        for(int i = 0; i < a.length; i++){
            int j =0;
            while(b[j] != a[i]) j++;
            while(j < b.length && b[j] <= a[i]) j++;
            ans[i]= j == b.length ? -1 : b[j];

        }
        return ans;
    }
}