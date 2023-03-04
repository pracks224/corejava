import java.io.BufferedReader;
        import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

class Prefix_sum_array {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt();
        while(numTestCases >0) {
            int arrnumSize = scanner.nextInt();
            long[] numArr = new long[arrnumSize];
            scanner.nextLine(); // added
            String s = scanner.nextLine();
            String[] arr = s.split(" ");
            for(int i =0;i<arr.length;i++){
                numArr[i] = Long.parseLong(arr[i]);
            }
           long[] convertedArr =  prefixSumArr(numArr);
            for(int i =0;i<convertedArr.length;i++){
               System.out.print(" "+convertedArr[i]);
            }
            numTestCases--;
        }

    }

   static long[] prefixSumArr(long[] numArr){
        long[] changedArr = new long[numArr.length];
        long first = Integer.MIN_VALUE, second = Integer.MIN_VALUE,third = Integer.MIN_VALUE;
        long prefixSum = 0;
         if(numArr.length<=2){
             Arrays.fill(changedArr,-1);
         }else{
             changedArr[0] = -1;
             changedArr[1] = -1;
             for(int i =0;i< numArr.length;i++){
                 long current = numArr[i];
                 if(current>first){
                     third = second;
                     second = first;
                     first = current;
                    // prefixSum = third+second+first;
                 }else if(current>second){
                     third = second;
                     second = current;
                  //   prefixSum = third+second+first;
                 }else if(current>third){
                     third = current;
                 }
                 if(i >=2){
                   //  System.out.println
                     prefixSum = (long)third+second+first;
                     changedArr[i] = prefixSum;
                 }


             }
         }
        return changedArr;
   }
}

//input :   31612 24956 1240 11424 2530 5566 25328 22007 9790 19914 4274 21313 493 2641 3477 24938 29757
//output : -1 -1 57808 67992 67992 67992 81896 81896 81896 81896 81896 81896 81896 81896 81896 81896 86697
