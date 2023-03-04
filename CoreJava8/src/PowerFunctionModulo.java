
public class PowerFunctionModulo {
    public final static int MOD =1000000007;
        public static void main(String[] args) {
            long base = 2;
            long exponent = 5;
            long result = fastPowerModulo(base, exponent, MOD);
            System.out.println(result);
        }

        static long fastPowerModulo(long base, long exponent, int mod) {
           long result = 1;
           base %= mod;
           while(exponent>0){
               if((exponent & 1) == 1){
                   result = (result * base)%mod;
               }
               exponent >>=1;
               base = (base *base)%mod;
           }
           return result;
    }
}
