package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class PascalIntegers {
    public static void main(String[] args) {
     System.out.println(generatePascal(9));
    }

    public static List<List<Integer>> generatePascal(int n) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        list.add(first);
        for (int i = 1; i < n; i++) {
            List<Integer> ls = new ArrayList<>();
            List<Integer> prevList = list.get(i-1);
            ls.add(1);
            for (int j = 1; j < i; j++) {
                ls.add(prevList.get(j)+prevList.get(j-1));
            }
            ls.add(1);
            list.add(ls);
        }
        return list;
    }
}
