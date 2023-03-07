package Array;

import java.util.HashMap;
import java.util.Map;

public class NoOfTrips {
    public static void main(String[] args) {
        int[] nums = {5,10,10};
        long result = minimumTime(nums, 9);
        System.out.println(result);
    }

    public static long minimumTime(int[] time, int totalTrips) {
        long left =0;
        Long right = Long.MAX_VALUE;
        long mintrips=right;
        while(left<right){
            long numofTrips =0;
            long mid = (left+right)/2;
            for(int i =0;i<time.length;i++){
                numofTrips += (mid/time[i]);
            }
            if(numofTrips>=totalTrips){
                mintrips = Math.min(mintrips,mid);
                right = mid;
            }else{
                left= mid+1;
            }
        }
       return mintrips;
    }
}
