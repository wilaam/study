  import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by asus on 2016-02-04.
 */
public class ComplementaryPairsHashMap {
    public static void main(String[] args) {
        int[] A = {4, 11, 0, 3, 4, 6, 1, 7, 8};
        int K = 12;
        Solution7 pairs = new Solution7();
        System.out.println(pairs.solution(K,A));
    }
}

class Solution7 {
    public int solution (int K, int[] A){
        int result = 0;
        HashMap<Integer,Integer> occurance =new HashMap<Integer,Integer>();
        for (int i : A) {
            Integer oldValue = occurance.get(i);
            if (oldValue==null){
                occurance.put(i,1);
            }
            else
                occurance.put(i,oldValue+1);
        }
        for (int i : A) {
            if (occurance.containsKey(K-i)){
                result+=occurance.get(K-i);
            }
        }

        return result;
    }
}

