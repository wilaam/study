/**
 * Created by asus on 2016-02-04.
 */
public class ComplementaryPairs {
    public static void main(String[] args) {
        int[] A = {1, 8, -3, 0, 1, 3, -2, 4, 5};
        int K = 6;
        Solution6 pairs = new Solution6();
        System.out.println(pairs.solution(K,A));
    }
}

class Solution6 {
    public int solution (int K, int[] A){
        int result=0;
        for (int i = 0; i <A.length ; i++) {
            for (int j = 0; j <A.length ; j++) {
                if (A[i]+A[j]==K){
                    result++;
                }
            }
        }
        return result;
    }
}

