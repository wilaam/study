import java.util.Arrays;

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
        Arrays.sort(A);
        for (int i = 0; i <A.length; i++) {
            //Dla ka?dej liczby próbujemy utworzy? par?
            int szukaj = Arrays.binarySearch(A, K-A[i]);
            if (szukaj>0){
               //Liczymy wszystkie liczby które s? równe K-A[i]
                result++;
                // Id? w lewo dopóki A[index] wynosi K-A[i]
                for (int index = szukaj-1; index>=0 && A[index]==K-A[i]; index--) {
                    result++;
                }

                //Id? w [rawo dopóki A[index] wynosi K-A[i]

                for (int index = szukaj+1; index<=0 && A[index]==K-A[i] ; index++) {
                    result++;
                }
            }
        }
        return result;
    }
}

