package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
      // int convertedNum = romanToInt("XL",map);
        int convertedNum = romanToInt("CM");
       System.out.println(convertedNum);

    }
    public static int romanToInt(String s,Map<Character,Integer> map) {
        char[] chArr = s.toCharArray();
        int number =map.get(chArr[0]);
        for(int i=1;i<chArr.length;i++){
            if(chArr[i] == 'V' && chArr[i-1] == 'I'){
                number = number+3;
            }else if(chArr[i] == 'X' && chArr[i-1] == 'I'){
                number = number+8;
            }else if(chArr[i] == 'L' && chArr[i-1] == 'X'){
                number = number+30;
            }else if(chArr[i] == 'C' && chArr[i-1] == 'X'){
                number = number+80;
            }else if(chArr[i] == 'D' && chArr[i-1] == 'C'){
                number = number+300;
            }else if(chArr[i] == 'M' && chArr[i-1] == 'C'){
                number = number+800;
            }
            else{
                number = number + map.get(chArr[i]);
            }
        }
        return number;
    }

    public static int romanToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }
}
