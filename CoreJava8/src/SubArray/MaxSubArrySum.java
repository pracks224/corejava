package SubArray;

public class MaxSubArrySum {
    public static void main(String[] args) {

    }

    public static int Ksum(int[] nums,int k){
        int sum = 0;
        int n = nums.length;
        while(n>k){
            for(int i =0;i<k;i++){
                sum += nums[i];
            }
            int curr_sum = sum;
            for(int i =k;i<n;i++){

            }
        }
return 0;
    }
}
