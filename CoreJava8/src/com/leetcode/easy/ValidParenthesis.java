package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class ValidParenthesis {
    public static void main(String[] args) {
        String parren = "]";
        System.out.println(isValid(parren));
    }

    public static boolean isValid(String s) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '{':
                    list.add("{");
                    break;
                case '[':
                    list.add("[");
                    break;
                case '(':
                    list.add("(");
                    break;
                case '}':
                    if (!peekElement(list, "{")) return false;
                    break;
                case ']':
                    if (!peekElement(list, "[")) return false;
                    break;
                case ')':
                    if (!peekElement(list, "(")) return false;
                    break;
            }
        }
        return list.size() > 0 ? false : true;
    }

    public static boolean peekElement(ArrayList<String> list, String bracket) {
        boolean result = true;
        if (list.size() == 0) return false;
        if (bracket != list.get(list.size() - 1)) {
            result = false;
        }
        if (result) list.remove(list.size() - 1);
        return result;
    }
}
