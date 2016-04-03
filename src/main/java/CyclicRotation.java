/**
 * Created by asus on 2016-03-28.
 */
public class CyclicRotation {
    public static void main(String[] args) {
        int[] A={3,8,9,7,6};
        int K = 3;
        SolutionCyclicRotation result = new SolutionCyclicRotation();

        System.out.println(result.solution(A,K));
    }
}
class SolutionCyclicRotation{
    public int[] solution(int[] A, int K) {
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            if (i + K < A.length){
                B[i+K]=A[i];
            }
            if (i + K >= A.length){
               B[(i+K)%A.length]=A[i];
            }
        }
        for (int i = 0; i < B.length ; i++) {
            System.out.println(B[i]);
        }
        return B;
    }
}