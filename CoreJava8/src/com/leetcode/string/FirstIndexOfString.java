package com.leetcode.string;

public class FirstIndexOfString {
    public static void main(String[] args) {
        String str1 = "sadbutsad";
        String str2 = "sad";
        System.out.println(strStr(str1,str2));
    }
    public static int strStr(String haystack, String needle) {
           return haystack.indexOf(needle);
    }
}
