package DynamicProgramming;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PascalSereis {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    System.out.println(Arrays.toString(getPascalRow(num)));
        List<Integer> ls = new ArrayList<>();
    }

    public static int[] getPascalRow(int n) {
        int[] row = new int[n+1];
        row[0] = 1;
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        for (int i = 1; i <= n; i++) {
            ls.add(1);
            for (int j = i; j >= 1; j--) {
                row[j] += row[j-1];
                int jsum = ls.get(j);
                jsum +=ls.get(j-1);
                ls.set(j,jsum);
            }
        }
        return row;
    }

}
