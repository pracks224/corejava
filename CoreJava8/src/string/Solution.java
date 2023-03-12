package string;

import java.util.HashSet;

public class Solution {
    public int colorful(int A) {
        String s = Integer.toString(A);
        HashSet<Long> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            long product = 1;
            for (int j = i; j < s.length(); j++) {
                product = product * (s.charAt(j) - '0');
                if (hs.contains(product)) return 0;
                hs.add(product);
            }
        }
        return 1;
    }
}