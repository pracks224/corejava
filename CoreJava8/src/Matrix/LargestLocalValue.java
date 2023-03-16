package Matrix;
/*
You are given an n x n integer matrix grid.

Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:

maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid centered around row i + 1 and column j + 1.
In other words, we want to find the largest value in every contiguous 3 x 3 matrix in grid.

Return the generated matrix.



Example 1:

9 9 8 1
5 6 2 6
8 2 6 4  ======>> 9 9
6 2 2 2           8 6


*/

import java.util.Arrays;

public class LargestLocalValue {
    public static void main(String[] args) {
        int[][] grid = {
                        {9,9,8,1},
                        {5,6,2,6},
                        {8,2,6,4},
                        {6,2,2,2}
                       };
        int[][] res = largestLocal(grid);
        for(int i =0;i<res.length;i++){
            for(int j=0;j<res.length;j++){
                System.out.print(res[i][j] +" ");
            }
            System.out.println("");
        }

    }
    public static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] result = new int[n-2][n-2];
        for(int i =0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                for(int x=i;x<i+3;x++){
                    for(int y =j;y<j+3;y++){
                        result[i][j] = Math.max(result[i][j],grid[x][y]);
                    }
                }
            }
        }
        return result;
    }
}
