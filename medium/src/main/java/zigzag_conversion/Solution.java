package zigzag_conversion;

public class Solution {

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
        System.out.println(convert("ABC", 2));
        System.out.println(convert("ABCD", 2));
    }

    public static String convert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }

        int groupSize = numRows * 2 - 2;
        int groupWidth = numRows - 1;
        int length = (s.length() / groupSize + 1) * groupWidth;

        char[] array = s.toCharArray();
        char[][] v = new char[length][numRows];

        int groupSerial;
        int point = 0;
        for (int i = 0; i < length; i++) {
            groupSerial = i % groupWidth;
            if (groupSerial == 0) {
                for (int j = 0; j < numRows; j++) {
                    if (point + j < s.length()) {
                        v[i][j] = array[point + j];
                    }
                }
                point += numRows;
            } else {
                if (point < s.length()) {
                    v[i][numRows - 1 - groupSerial] = array[point];
                }
                point += 1;
            }
        }
        // StringBuilder builder = new StringBuilder();
        char[] rs = new char[s.length()];
        int iterator = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < length; j++) {
                if (v[j][i] != 0) {
                    rs[iterator++] = v[j][i];
                }
            }
        }
        return new String(rs);
    }
}
