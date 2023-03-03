import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int remainder = 0;
        int sum = 0;
        int initNum = num;
        while(num>0){
            remainder = num%10;
            sum += remainder * remainder * remainder; //sum += Math.pow(remainder,3);
            num = num/10;
        }
     //  System.out.println(sum);
        if(sum == initNum){
            System.out.println("It's an Armstrong Number!!!");
        }
    }
}
