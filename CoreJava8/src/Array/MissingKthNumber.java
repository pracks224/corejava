package Array;

public class MissingKthNumber {
    public static void main(String[] args) {
        int arr[] = {1,2}; //1,3,6,9,10
        int missing = 1;
        System.out.println(findKthPositive(arr, missing));
    }

    public static int findKthPositive(int[] arr, int k) {
        int temp = 1;
        int i = 0;
        while (k >= 1) {
            if (temp > arr[arr.length - 1]) {
                k--;
            } else if (temp == arr[i]) {
                i++;
            } else {
                k--;
            }
            if(k>=1)
              temp++;
        }
        return temp;
    }
}
