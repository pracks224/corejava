package com.leetcode.easy;

import java.util.*;

public class OverlappingRanges {
    public static void main(String[] args) {
        int[][] ranges = {{1, 3}, {2, 6}, {7,9},{8, 10}, {15, 18}};
        int[][] updated = countCombination(ranges);
        System.out.println(Arrays.deepToString(updated));
    }

    public static int[][] countCombination(int[][] ranges) {
        List<int[]> list   = new ArrayList<>();
        list.add(ranges[0]);
        for(int[] interval: ranges){
          int first = interval[0];
          int second = interval[1];
          if(first<list.get(list.size()-1)[1]){
              list.get(list.size()-1)[1] = second;
          }else{
              list.add(interval);
          }
        }
        return list.toArray(new int[list.size()][]);
    }
}
