/**
 * Created by asus on 2016-01-31.
 */
public class LengthOfTableCycle {
    public static void main(String[] args) {

        int[] A = {2,3,1,1,3};
        Solution result = new Solution();
        System.out.println(result.solution(A));

    }

    static class Solution {
        public int solution(int[] A ) {
            int[] B = new int[A.length];
            int step = 0;
            int i = 0;
            int result = 0;
            while (i<B.length){
                if (B[i]==0){
                    B[i]=step;
                    step++;
                    i=A[i];
                }
                else if (B[i]>0){
                    return result=step-B[i];
                }
            }
            return result;
        }
    }
}
