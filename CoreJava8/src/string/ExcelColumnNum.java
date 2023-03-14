package string;

public class ExcelColumnNum {
    public static void main(String[] args) {
       // System.out.println(titleToNumber("ZDA"));
        System.out.println(NumberToTitle(titleToNumber("ZDA")));
    }

    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result *= 26;
            result += columnTitle.charAt(i) - 'A' + 1;
        }
        return result;
    }

    public static String NumberToTitle(int num){
        StringBuilder builder = new StringBuilder();
        while(num>0){
           int remainder = num%26;
           if(remainder == 0){
               builder.append("Z");
               num = (num/26) -1;
           }else{
               char ch = (char) ((remainder-1)+'A');
               builder.append(""+ch);
               num = num/26;
           }

        }
       return builder.reverse().toString();
    }
}
