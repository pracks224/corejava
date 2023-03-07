package Array;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] num = {9, 9};
        int[] result = plusOne(num);
        System.out.println(Arrays.toString(result));
    }

    public static int[] plusOne(int[] digits) {
        int k = 1;
        int carry = 0;
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
        } else {
            digits[digits.length - 1] = k-1;
            carry =1;
            for (int i = digits.length - 2; i >= 0; i--) {
                int sum = carry + digits[i] ;
                if (sum > 9) {
                    digits[i] = 0;
                    carry = 1;
                } else {
                    digits[i] = sum;
                    carry = 0;
                }
            }
        }

        if (carry == 1) {
            int[] copy_digits = new int[digits.length + 1];
            copy_digits[0] = 1;
            for (int i = 1; i < copy_digits.length; i++) {
                copy_digits[i] = digits[i - 1];
            }
            return copy_digits;
        }
        return digits;

        //elegant way
    /*    for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;*/
    }
}
