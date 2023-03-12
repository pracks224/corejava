package string;

public class gcdOfStrings {
    public static void main(String[] args) {
       /* "TAUXXTAUXXTAUXXTAUXXTAUXX"
        "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"*/
        String str1 = "ABABAB";
            String str2 = "ABAB";
        System.out.println(gcdOfStrings(str1, str2));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";
        int gcdVal = gcd(str1.length() , str2.length());
        return str2.substring(0, gcdVal);
    }

    public static int gcd(int p,int q){
        if(q==0) return p;
        else return gcd(q,p%q);
    }
}
