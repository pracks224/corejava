import java.io.*;
import java.util.*;


public class TestClass_TramRide_HackerRank {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        int start = Integer.parseInt(br.readLine().trim());
        int finish = Integer.parseInt(br.readLine().trim());
        String[] arr_Ticket_cost = br.readLine().split(" ");
        int[] Ticket_cost = new int[N];
        for(int i_Ticket_cost = 0; i_Ticket_cost < arr_Ticket_cost.length; i_Ticket_cost++)
        {
            Ticket_cost[i_Ticket_cost] = Integer.parseInt(arr_Ticket_cost[i_Ticket_cost]);
        }

        long out_ = solve(N, start, finish, Ticket_cost);
        System.out.println(out_);

        wr.close();
        br.close();
    }
    static long solve(int N, int start, int finish, int[] Ticket_cost){
        // Write your code here
        long result = 0;
        int[] prefixSumArrClockwise = new int[Ticket_cost.length];
        int[] prefixSumArrAntiClockwise = new int[Ticket_cost.length];
        prefixSumArrClockwise[0] = Ticket_cost[0];
        prefixSumArrAntiClockwise[0] = Ticket_cost[Ticket_cost.length-1];
        for(int i =1;i< Ticket_cost.length;i++){
            prefixSumArrClockwise[i] =+ prefixSumArrClockwise[i-1]+Ticket_cost[i];
            prefixSumArrAntiClockwise[i] =+ prefixSumArrAntiClockwise[i-1]+Ticket_cost[Ticket_cost.length-i-1];
        }
        // Clock wise distance between start and end
        int cost_clockwise =  prefixSumArrClockwise[finish-2];
        int cost_anti_clockwise = 0;
        if(start == 1 && finish<Ticket_cost.length){
            cost_clockwise = prefixSumArrClockwise[finish-2];
            cost_anti_clockwise = prefixSumArrAntiClockwise[Ticket_cost.length-finish];
        }else if(start == 1 && finish == Ticket_cost.length){
            cost_clockwise = prefixSumArrClockwise[finish-1];
            cost_anti_clockwise = prefixSumArrAntiClockwise[Ticket_cost.length-finish];
        }
        else if(start>finish){
            cost_anti_clockwise = prefixSumArrAntiClockwise[Ticket_cost.length-finish]-prefixSumArrAntiClockwise[Ticket_cost.length-start];
        }else if(finish>start){
              System.out.println(prefixSumArrClockwise[finish-1]);
              System.out.println(prefixSumArrClockwise[start-2]);
            cost_clockwise = prefixSumArrClockwise[finish-1] - prefixSumArrClockwise[start-2];
            cost_anti_clockwise = prefixSumArrAntiClockwise[Ticket_cost.length-start]-prefixSumArrAntiClockwise[Ticket_cost.length-finish];
        }
        result = Math.min(cost_clockwise,cost_anti_clockwise);
        return result;

    }
}
