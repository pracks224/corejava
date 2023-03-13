package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxSumArray {
    public static void main(String[] args) {
        // int[] nums ={2,4,3};
        // System.out.println(largestSumAfterKNegations(nums,1));
        int[] intArray = {57, 6, -4, -8, 42, 38, 9, -7, -6, -5};
        ArrayList<Integer> intList = new ArrayList<Integer>(intArray.length);
        for (int i : intArray) {
            intList.add(i);
        }

        int sum = solve(intList, 10);
        System.out.println(sum);
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int sum = 0;
        Collections.sort(A);
        if (A.get(0) >= 0 && B % 2 != 0) {
            A.set(0, -1 * A.get(0));
        } else if (A.get(0) < 0) {
            int modify = 0;
            while (B > 0 && A.get(modify) < 0 && modify < A.size()) {
                A.set(modify, -1 * A.get(modify));
                modify++;
                B--;
            }

            /*if ((B & 1) != 0) {
                A.set(0, -1 * A.get(0));
            }*/
            if (B % 2 != 0) {
                int index = A.get(modify) < A.get(modify - 1) ? modify : modify - 1;
               A.set(modify,-1*A.get(modify));
            }
        }

        for (int num : A) {
            sum += num;
        }
        return sum;
    }

    public static int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int sum = 0;
        // k = k%nums.length;
        while (i < nums.length) {
            if (k > 0 && nums[i] < 0) {
                nums[i] *= -1;
                k--;
            }
            sum += nums[i++];
        }
        Arrays.sort(nums);
        if ((k & 1) == 1) sum -= (2 * nums[0]);
        return sum;
    }
/*
    Another approach
    Sort the array.
     Check if first element of the array is positive.
        i. If K is even, don't modify anything.
        ii. Else, modify the lowest element.
      Else, mark all -ve elements positive for a given K.
      If K after operations is not even then, mark the lowest element -ve.
      Sum up and return.
 */
  /*  public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        int sum = 0;
        if (A[0] >= 0 && K % 2 != 0) {
            A[0] = - A[0];
        } else if (A[0] < 0 ) { //&& K % 2 == 0) {
            int change = 0;
            while (K > 0 && A[change] < 0 && change < A.length) {
                A[change] = - A[change++];
                K--;
            }
            if (K % 2 != 0) {
                int index = A[change] < A[change - 1] ? change : change - 1;
                A[index] = - A[index];
            }
        }
        for (int val : A) sum += val;
        return sum;
    } */
}
