import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter  implements Runnable{
    public static void main(String args[]){
         String str = "New";
        /* String str_rev = "";
         char ch;
         for(int i =0;i<str.length();i++) {
              ch =  str.charAt(i);
              str_rev = ch+str_rev;
         }
         System.out.println(str_rev);*/
       String  strkk =  reverseWords("I am Java developer");
       System.out.println(strkk);
    }

     static String reverseWords(String str){

       String[] strSplitted =  str.split(" ");
       String result ="";

       for(int i =0;i< strSplitted.length;i++){
          // strK += strSplitted[i];

           if (i == strSplitted.length - 1)
               result = strSplitted[i] + result;
           else
               result = " " + strSplitted[i] + result;
       }
       return result;

    }

    @Override
    public void run() {
        for(int i =1;i<10;i++) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
