class Solution {
    public long sumAndMultiply(int n) {
        long num = 0;
        long sum = 0;

        String str = String.valueOf(n);

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c != '0'){
                int digit = c - '0';
                num = num * 10 + digit;
                sum += digit;
            }
        }

        return sum * num;
    }
}