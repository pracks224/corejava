package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*  Start time      : 06-03-2023 8:56PM
    Target end time :9:30PM - Not able to complete
*/
public class ArrayIntersection {
    public static void main(String[] args) {
        int[] nums1 = {0, 2, 5, 5, 7, 7, 8, 9};
        int[] nums2 = {1, 4, 8, 9};
        int[] resultArr = intersect(nums1, nums2);
        System.out.println(Arrays.toString(resultArr));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ls = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int m = nums1.length;
        int n = nums2.length;
        int j = 0;
        int i = 0;
        while (i < m && j < n) {
            if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                ls.add(nums1[i]);
                i++;
                j++;
            }
        }

        return ls.stream().mapToInt(Integer::intValue).toArray();
    }
}

    /*//With out sorting
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums1){
            int freq = map.getOrDefault(i, 0);
            map.put(i, freq + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums2){
            if(map.get(i) != null && map.get(i) > 0){
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        int[] ret = new int[list.size()];
        for(int i = 0; i < list.size();i++){
            ret[i] = list.get(i);
        }
        return ret;
    }
}*/
