package string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonUnique {
    public static void main(String[] args) {
        int index = firstUniqChar("aadadaad");
        System.out.println(index);
    }

    public static int firstUniqChar(String s) {
       //Optimized way
       /* int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;*/

       /* public int firstUniqChar(String s) {
            // Stores lowest index / first index
            int ans = Integer.MAX_VALUE;
            // Iterate from a to z which is 26 which makes it constant
            for(char c='a'; c<='z';c++){
                // indexOf will return first index of alphabet and lastIndexOf will return last index
                // if both are equal then it has occured only once.
                // through this we will get all index's which are occured once
                // but our answer is lowest index
                int index = s.indexOf(c);
                if(index!=-1&&index==s.lastIndexOf(c)){
                    ans = Math.min(ans,index);
                }
            }

            // If ans remain's Integer.MAX_VALUE then their is no unique character
            return ans==Integer.MAX_VALUE?-1:ans;
        }*/



        int index_non_repeat = -1;
        Map<Character, Integer> map = new HashMap<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, -1);
            } else {
                map.put(ch, i);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            int index = (int) entry.getValue();
            if (index_non_repeat == -1 && index != -1) {
                index_non_repeat = index;
            }else if(index_non_repeat>index  && index != -1){
                index_non_repeat = index;
            }
        }
        return index_non_repeat;
    }
}
