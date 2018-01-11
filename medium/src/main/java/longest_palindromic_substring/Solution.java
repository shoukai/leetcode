package longest_palindromic_substring;

class Solution {
    public String longestPalindrome(String s) {
        char[] array = s.toCharArray();
        int max = 0;
        int rsStart = 0;
        int rsEnd = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length; j > i; j--) {
                if (array[i] == array[j - 1]) {
                    int length = j - i;
                    if (length <= max) {
                        continue;
                    }
                    if (isPalindrome(array, i, j)) {
                        if (max < length) {
                            max = length;
                            rsStart = i;
                            rsEnd = j;
                        }
                    }
                }
            }
        }
        return s.substring(rsStart, rsEnd);
    }

    static boolean isPalindrome(char[] array, int start, int end) {
        int l = end - start;
        if (l <= 1) return true;
        for (int i = 0; i < l / 2; i++) {
            if (array[i + start] != array[end - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}