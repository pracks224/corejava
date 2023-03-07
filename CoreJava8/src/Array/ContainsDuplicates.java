package Array;

import java.util.*;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        /*Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                return false;
            }
        }
        return true;*/
        //Using Set
        /*final Set<Integer> distinct = new HashSet<>();
        for(int num : nums) {
            if(distinct.contains(num)) {
                return true;
            }
            distinct.add(num);
        }
        return false;*/

        //Using Map
        final Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                int count = map.get(num);
                count++;
                if (count < 2)
                    map.put(num, count++);
                else
                    return true;
            } else {
                map.put(num, 1);
            }
        }

        return false;
    }
}
