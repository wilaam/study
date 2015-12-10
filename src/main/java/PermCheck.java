import java.util.Arrays;

/**
 * Created by asus on 2015-12-09.
 */
public class PermCheck {
    public static void main(String[] args) {
        //int[] A = {5,4,1};
        int[] A={999999,998987};
        Solution4 permCheck = new Solution4();
        System.out.println(permCheck.solution4(A));
    }
}

class Solution4 {
    public int solution4(int[] A) {
        boolean[] result = new boolean[A.length+1];

        Arrays.sort(A);
        for (int i = 0; i < A.length ; i++) {
            if (A[i]-1<A.length && !result[A[i]-1]){
                result[A[i]-1]=true;
            }
            else {
                return 0;
            }
        }
    return 1;
    }

}