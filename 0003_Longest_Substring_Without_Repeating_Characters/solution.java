class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] freq = new int[256];

        int i = 0;
        int j = 0;
        int max = 0;

        while (i < s.length()) {

            char ch = s.charAt(i);

            // No duplicate
            if (freq[ch] == 0) {

                freq[ch]++;
                i++;

                max = Math.max(max, i - j);

            } 
            // Duplicate found
            else {

                freq[s.charAt(j)]--;
                j++;
            }
        }

        return max;
    }
}