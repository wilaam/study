/**
 * Created by asus on 2015-11-25.
 */
public class TapeEquilibrium2 {
    public static void main(String[] args) {
        int A[] = {3, 1, 2, 4, 3};

        TapeEquilibrium firstClass = new TapeEquilibrium();
        System.out.println(firstClass.solution(A));
    }


    public int solution(int[] A) {

        int n = A.length;
        int sum1=0;
        int sum2=0;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            sum1 = A[i] + sum1;
        }

        for (int i = 0; i < n-1 ; i++) {

            sum1 = sum1 - A[i];
            sum2 = sum2 + A[i];
            int current = Math.abs(sum2 - sum1);
            if (current < min) {
                min = current;
            }
        }
        return min;
    }
}
