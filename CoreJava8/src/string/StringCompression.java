package string;

import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd'};
        System.out.println(compression(chars));
    }

    //Compression using Extra space
    public static int compression(char[] chars) {
        StringBuilder builder = new StringBuilder();
        int cnt = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) cnt++;
            else {
                builder.append(chars[i]).append(++cnt);
                cnt = 0;
            }

        }
        builder.append(chars[chars.length - 1]).append(++cnt);
        chars = builder.toString().toCharArray();
        System.out.println(Arrays.toString(chars));
        return builder.length();
    }


    public static int compressionConstantSpace(char[] chars) {
       int i = 0, k = 0;
        while (i < chars.length) {
            char current = chars[i];
            int count = 0;
            for (int j = i; j < chars.length; j++) {
                if (chars[j] == current) {
                    count++;
                    k++;
                }else{
                    break;
                }
            }
            chars[i++] = current;
            if(count != 1)
                for(char c : Integer.toString(count).toCharArray())
                    chars[i++] = c;
        }
        //System.out.println(Arrays.toString(chars));
        return i;
    }

}


///
/*public int compress(char[] chars) {
    int indexAns = 0, index = 0;
    while(index < chars.length){
        char currentChar = chars[index];
        int count = 0;
        while(index < chars.length && chars[index] == currentChar){
            index++;
            count++;
        }
        chars[indexAns++] = currentChar;
        if(count != 1)
            for(char c : Integer.toString(count).toCharArray())
                chars[indexAns++] = c;
    }
    return indexAns;
}*/
