class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int idx = 0;

        for(int i = 0; i < n;){
            char current = chars[i];
            int count = 0;

            while(i < n && chars[i]==current){
                i++;
                count++;
            }
            chars[idx++] = current;
            if(count > 1){
                for(char c :String.valueOf(count).toCharArray()){
                    chars[idx++] = c;
                }
            }
        }
        return idx;
    }
}