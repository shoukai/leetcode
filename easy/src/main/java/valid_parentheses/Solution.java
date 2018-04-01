package valid_parentheses;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("([])"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("((])"));
        System.out.println(isValid("{}][}}{[))){}{}){(}]))})[({"));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        char[] array = s.toCharArray();
        char[] stack = new char[array.length];
        int point = 0;

        if (!isLeft(array[0])) {
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            if (isLeft(array[i])) {
                stack[point] = array[i];
                point++;
            } else {
                if (pair(array[i], stack[point - 1])) {
                    point--;
                } else {
                    return false;
                }
            }
        }
        return point == 0;
    }

    static boolean isLeft(char item) {
        return item == '{' || item == '(' || item == '[';
    }

    static boolean pair(char item, char target) {
        if (target == '{') {
            return item == '}';
        } else if (target == '(') {
            return item == ')';
        } else if (target == '[') {
            return item == ']';
        }
        return false;
    }

}
