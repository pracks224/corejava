package string;

public class RemoveLetterEqualFreq {
    public static void main(String[] args) {
        System.out.println(equalFrequency("abcc"));
    }

    public static boolean equalFrequency(String str) {
        int[] count = new int[26];
        char[] chars = str.toCharArray();
        for (char c : chars) {
            ++count[c - 'a'];
        }
        for (char c : chars) {
            --count[c - 'a'];
            if (equalCountCheck(count)) {
                return true;
            }
            ++count[c - 'a'];
        }
        return false;
    }

    public static boolean equalCountCheck(int[] count) {
        int freq = -1;
        for (final int c : count) {
            if (c == 0 || c == freq)
                continue;
            if (freq == -1)
                freq = c;
            else
                return false;
        }
        return true;

    }

}
