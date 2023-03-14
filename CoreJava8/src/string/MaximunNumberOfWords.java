package string;

import java.util.StringTokenizer;

public class MaximunNumberOfWords {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        int maxWors = 0;
        for (String sentence : sentences) {
           /* String[] arr = sentence.split(" ");
            maxWors = Math.max(maxWors, arr.length);*/
            //Another approach

            maxWors = Math.max(maxWors,new StringTokenizer(sentence).countTokens());
        }
        return maxWors;
    }
}
