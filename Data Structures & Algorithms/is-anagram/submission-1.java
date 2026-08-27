class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        if (s.length() != t.length())
            return false;
        for (char ch : s.toCharArray()) {
            arr[ch - 'a']++;
        }

        for (char c : t.toCharArray()) {
            arr[c - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
