import java.io.BufferedReader;
        import java.io.InputStreamReader;
import java.util.Scanner;

class Prefix_sum_array {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt();
        while(numTestCases >0) {
            int arrnumSize = scanner.nextInt();
            int[] numArr = new int[arrnumSize];
            scanner.nextLine(); // added
            String s = scanner.nextLine();
            String[] arr = s.split(" ");
            for(int i =0;i<arr.length;i++){
                numArr[i] = Integer.parseInt(arr[i]);
            }
           int[] convertedArr =  prefixSumArr(numArr);
            for(int i =0;i<convertedArr.length;i++){
               System.out.print(" "+convertedArr[i]);
            }
            numTestCases--;
        }

    }

   static int[] prefixSumArr(int[] numArr){
        int[] changedArr = new int[numArr.length];
        int largest = Integer.MIN_VALUE;
        int secondLargest  = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

      for(int i =0;i< numArr.length;i++){
          int current = numArr[i];
          if(current>largest){
              thirdLargest = secondLargest;
              secondLargest = largest;
              largest = current;
          }else if(current>secondLargest){
              thirdLargest = secondLargest;
              secondLargest = current;

          }else if (current>thirdLargest){
              thirdLargest = current;
          }
      }
      // System.out.println(largest+" "+secondLargest+" "+ thirdLargest);
       boolean largestNumFound = false;
       boolean secondlargestNumFound = false;
       boolean thirdlargestNumFound = false;
       for(int i =0;i< numArr.length;i++){
           if(numArr[i] == largest ){
               largestNumFound = true;
           }else if(numArr[i] == secondLargest){
               secondlargestNumFound = true;
           }else if(numArr[i] == thirdLargest){
               thirdlargestNumFound = true;
           }
           if(largestNumFound && thirdlargestNumFound && secondlargestNumFound){
               changedArr[i] = secondLargest+ thirdLargest+largest;
           }else if(thirdlargestNumFound && secondlargestNumFound){
               changedArr[i] = secondLargest+ largest;
           }else{
               changedArr[i] = -1;
           }
       }

        return changedArr;
   }
}
