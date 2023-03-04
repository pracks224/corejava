package com.leetcode.easy;

import java.util.HashMap;

/*Example Input
        Input 1:
        A = ["abcdefgh", "aefghijk", "abcefgh"]
        Input 2:
        A = ["abab", "ab", "abcd"];
        Example Output
        Output 1:"a"
        Output 2:"ab"*/
public class LongestCommonPrefix {
    public static void main(String[] args) {
      String[] strArr = {"aaa","aa","aaa"};
      System.out.println(longestCommonPrefix(strArr));
    }
    public static String longestCommonPrefix(String[] strs) {
        String commonPrefix = strs[0];
        StringBuilder localPref = new StringBuilder("");
        for(String str:strs){
            if(commonPrefix.isBlank()){
                break;
            }
            localPref.setLength(0);
            String to_compare = commonPrefix.length()>str.length()?str:commonPrefix;
            for(int j =0;j<to_compare.length();j++){
                 if(commonPrefix.charAt(j) != str.charAt(j)){
                     commonPrefix = commonPrefix.substring(0,j);
                     break;
                 }else{
                     localPref.append(str.charAt(j));
                 }
            }
            commonPrefix = localPref.toString();
        }
       return commonPrefix;
    }
    //Yet to check the optmized solutions
}