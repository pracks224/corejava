import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Summation_Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = (num  * (num+1))/2;
        System.out.println(sum);

    }
}
