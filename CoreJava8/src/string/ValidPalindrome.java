package string;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "ab_a";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
       s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(s);
        int st =0,en=s.length()-1;
        if(s.isEmpty()) return true;
        while(st<en){
            if(s.charAt(st) != s.charAt(en)){
                return false;
            }else{
                st++;en--;
            }
        }
        return true;
    }
}
