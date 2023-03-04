import java.util.Arrays;

public class Tram_Ride_Hacker_Rank {
    public static void main(String[] args){
        int[] ticket_cost_arr = {20,19,2,2,26,18,7,7,10,9,6,3,20,10,2,8,26,8,23,17};
        int start = 1;
        int finish = 16;
        int[] prefixSumArrClockwise = new int[ticket_cost_arr.length];
        int[] prefixSumArrAntiClockwise = new int[ticket_cost_arr.length];
        prefixSumArrClockwise[0] = ticket_cost_arr[0];
        prefixSumArrAntiClockwise[0] = ticket_cost_arr[ticket_cost_arr.length-1];
        for(int i =1;i< ticket_cost_arr.length;i++){
            prefixSumArrClockwise[i] =+ prefixSumArrClockwise[i-1]+ticket_cost_arr[i];
            prefixSumArrAntiClockwise[i] =+ prefixSumArrAntiClockwise[i-1]+ticket_cost_arr[ticket_cost_arr.length-i-1];
        }
        // Clock wise distance between start and end
        int cost_clockwise =  prefixSumArrClockwise[finish-2];
        int cost_anti_clockwise = 0;
        if(start == 1 && finish<ticket_cost_arr.length){
            cost_clockwise = prefixSumArrClockwise[finish-2];
            cost_anti_clockwise = prefixSumArrAntiClockwise[ticket_cost_arr.length-finish];
        }else if(start == 1 && finish == ticket_cost_arr.length){
            cost_clockwise = prefixSumArrClockwise[finish-1];
            cost_anti_clockwise = prefixSumArrAntiClockwise[ticket_cost_arr.length-finish];
        }
        else if(start>finish){
            cost_anti_clockwise = prefixSumArrAntiClockwise[ticket_cost_arr.length-finish]-prefixSumArrAntiClockwise[ticket_cost_arr.length-start];
        }else if(finish>start){
            cost_clockwise = prefixSumArrClockwise[finish-1] - prefixSumArrAntiClockwise[start-1];
            cost_anti_clockwise = prefixSumArrAntiClockwise[ticket_cost_arr.length-start]-prefixSumArrAntiClockwise[ticket_cost_arr.length-finish];
        }
        int min_cost = Math.min(cost_clockwise,cost_anti_clockwise);
        System.out.println("MIN COST--->"+min_cost);


    }

}
