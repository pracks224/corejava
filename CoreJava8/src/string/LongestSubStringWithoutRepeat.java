package string;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestSubStringWithoutRepeat {
    public static void main(String[] args) {
       // System.out.println(lengthOfLongestSubstring("pwwkew"));
        String str = "aro";
        Pattern pattern = Pattern.compile("^[aeiou].*");
        Matcher match = pattern.matcher(""+str.charAt(0));
        Matcher match2 = pattern.matcher(""+str.charAt(str.charAt(str.length()-1)));
        if(match.matches() && match2.matches()){

        }
    }

    public static int lengthOfLongestSubstring(String s) {
        int beginIndex = 0;
        int maxLen = 0;
        if (s == null || s.length() == 0) return 0;
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(beginIndex, i);
            char ch = s.charAt(i);
            if (str.contains("" + ch)) {
                beginIndex = i-1;
            } else {
                maxLen = Math.max(maxLen, (i - beginIndex) + 1);
            }
        }
        return maxLen;
    }
}
