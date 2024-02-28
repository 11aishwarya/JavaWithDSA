package Arrays;

import java.util.ArrayList;
import java.util.List;

public class kadanesUsingAL {
    public static void Kadanes(List<Integer>A){
        int MS = Integer.MIN_VALUE;
        int CS = 0;
        for(int i = 0; i< A.size();i++){
            CS = CS+ A.get(i);
            if(CS < 0){
                CS = 0;
            }
            MS = Math.max(CS, MS);
        }
        System.out.println("max Sum of subArray" + MS);
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(-2);
        A.add(-3);
        A.add(4);
        A.add(-1);
        A.add(-2);
        A.add(1);
        A.add(5);A.add(-3);
        Kadanes(A);
    }
}
