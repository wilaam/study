
public class MaxCounters {
    public static void main(String[] args) {
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int N = 5;
        Solution5 result = new Solution5();
        result.solution5(N, A);
    }
}

class Solution5 {
    public int[] solution5(int N, int[] A) {
        int counters[] = new int[N];
        int maxCounter = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 1 && A[i] <= N) {
                counters[A[i] - 1] = counters[A[i] - 1] + 1;
                if (counters[A[i] - 1] > maxCounter) {
                    maxCounter = counters[A[i] - 1];
                }
            } else if (A[i] > N) {
                for (int j = 0; j < counters.length; j++) {
                    counters[j] = maxCounter;
                }
            }
        }
        for (int i = 0; i < counters.length; i++) {
            System.out.print(counters[i]);
        }
        return counters;
    }
}
