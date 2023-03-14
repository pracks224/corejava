package string;

public class PerformOperations {
    public static void main(String[] args) {
        String[] strArr = {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(strArr));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String op : operations) {
            if (op.charAt(1) == '+')
                ++x;
            else
                --x;
        }
        return x;
    }
}
