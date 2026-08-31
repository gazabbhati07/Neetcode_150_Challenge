class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int Mlen = 0;
        Set<Character> hs = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            while (!hs.add(ch)) {
                char c = s.charAt(low);
                hs.remove(c);
                low++;
            }
            Mlen = Math.max(Mlen, i - low + 1);
        }
        return Mlen;
    }
}
