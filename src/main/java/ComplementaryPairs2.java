import java.util.Arrays;
import java.util.Collections;

/**
 * Created by asus on 2016-02-05.
 */
public class ComplementaryPairs2 {
    public static void main(String[] args) {
        int[] A = {1, 8, -3, 0, 1, 3, -2, 4, 5};
        int K = 6;
        CP2 pairs = new CP2();
        System.out.println(pairs.solution(K, A));
    }
}

class CP2 {
    public int solution(int K, int[] A) {
        int result = 0;
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            int value = Arrays.binarySearch(A, K-A[i]);
            if (value > 0) {
                result++;
            }
            if (value==i){
                result++;
            }
        }
        return result;
    }
}
