package Array;

import java.util.Arrays;
import java.util.Collections;

public class KokoEatingBanana {
    public static void main(String[] args) {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 7;
        System.out.println("||||~~~~~~~~|||" + minEatingSpeed(piles, h));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int lower = 1, high = Arrays.stream(piles).max().getAsInt();
        while (lower < high) {
            int mid = lower + (high-lower) / 2;
            int totalHour = 0;
            for (int i = 0; i < piles.length; i++) {
                if (piles[i] >= mid) {
                    if (piles[i] % mid == 0)
                        totalHour = totalHour + (piles[i] / mid);
                    else
                        totalHour = totalHour + (piles[i] / mid) + 1;
                } else {
                    totalHour++;
                }
            }
            if (totalHour <= h) {
                high = mid;
               // minSpeed = Math.min(minSpeed, mid);
            } else {
                lower = mid+1;
               // minSpeed = Math.min(minSpeed, mid);
            }
        }
        return high;
    }
}
