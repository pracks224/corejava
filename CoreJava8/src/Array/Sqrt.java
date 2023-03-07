package Array;

public class Sqrt {
    public static void main(String[] args) {
     System.out.println(sqrtDecimal(8,0,8));
    }
    public static int sqrtDecimal(int x,int st,int en){
        /*int mid = (st+en)/2;
        int square = mid * mid;
        if ((square == x) ||
                (Math.abs(square - x) < 0.00001))
            return mid;
        else if(square<x){
            return sqrtDecimal(x,mid,en);
        }else{
            return sqrtDecimal(x,st,mid);
        }*/
        //cleaner approach
        if (x == 0) return 0;
        int start = 1, end = x;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid <= x / mid && (mid + 1) > x / (mid + 1))// Found the result
                return mid;
            else if (mid > x / mid)// Keep checking the left part
                end = mid;
            else
                start = mid + 1;// Keep checking the right part
        }
        return start;
    }
}
