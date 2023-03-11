package DynamicProgramming;

public class FibonacciDP {
    public static void main(String[] args) {
        System.out.println(fiboncci(5));
    }

    public static int fiboncci(int num){
        int a = 0,b=1,c=0;
        for(int i =2;i<num;i++){
            c = a+b;
            a =b; b= c;
        }
        return c;
    }
}
