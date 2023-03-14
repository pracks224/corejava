package Array;

public class reverse_array {
    public static void main(String[] args) {
        int[] intArr = {5,6,3,4,6,8,9};
        int[] reverseArr = new int[intArr.length];
        for(int i = intArr.length-1;i>=0;i--){
            reverseArr[intArr.length-1-i] = intArr[i];
        }
        for(int j=0;j< reverseArr.length;j++){
            System.out.println(reverseArr[j]);
        }
    }
}
