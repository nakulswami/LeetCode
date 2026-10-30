
class Solution {
    public int[] twoSum(int[] a, int x) {
        int l=0, r=a.length-1;

        while(l<r) {
            int sum=a[l]+a[r];

            if(sum==x) return new int[]{l+1,r+1};
            if(sum<x) l++;
            else r--;
        }
        return new int[]{-1,-1};
    }
}