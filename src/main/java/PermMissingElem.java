import sun.misc.Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by asus on 2015-11-30.
 */
public class PermMissingElem {
    public static void main(String[] args) {
        int[] A = {2,3,1,5};

        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution2(A));
    }
}

    class Solution2 {
        public int solution2(int[] A) {
            Arrays.sort(A);


            for (int i = 0; i <A.length ; i++) {
                if(A[i] != i+1){
                  return A[i]=i+1;
                }

            }
            return A.length+1;
        }

    }