/**
 * Created by asus on 2015-11-25.
 */
public class FrogJmp {


    public static void main(String[] args) {
        int X = 10;
        int Y = 85;
        int D = 30;

        Solution frogJmp = new Solution();
        System.out.println(frogJmp.solution(X,Y,D));

    }
}


   class Solution {
        public int solution(int X, int Y, int D){
            int distance = Y-X;
            int jumps = distance / D;
            if (distance % D ==0){
                return jumps;
            }
            else return jumps+1;
        }
}
