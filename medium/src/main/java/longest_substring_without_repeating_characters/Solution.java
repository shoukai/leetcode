package longest_substring_without_repeating_characters;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] array = s.toCharArray();
        for (int i = s.length(); i >= 0; i--) {
            if (i >= 128) {
                continue;
            }
            for (int j = 0; j <= s.length() - i; j++) {
                boolean stop = false;
                if (stop) {
                    break;
                }
                for (int m = j; m < j + i; m++) {
                    if (stop) {
                        break;
                    }
                    for (int n = m + 1; n < j + i; n++) {
                        if (array[m] == array[n]) {
                            stop = true;
                            break;
                        }
                    }
                }
                if (!stop) {
                    return i;
                }
            }
        }
        return 0;
    }
}
