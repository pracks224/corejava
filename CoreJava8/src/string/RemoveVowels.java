package string;

public class RemoveVowels {
    public static void main(String[] args) {
        String str = "aeiou";
        System.out.println(str);
        str = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(str);
    }
}
