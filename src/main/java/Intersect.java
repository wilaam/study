import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by stawicad on 2016-05-11.
 */
public class Intersect {
    public static void main(String[] args) {
        Integer[] array1 = {1, 3, 7, 14, 51, 3};
        Integer[] array2 = {7, 51, 25, 36, 91, 3, 3};
        firstApproach(array1, array2);
        secondApproach(array1, array2);
        thirdApproach(array1, array2);

    }

    //
    private static void thirdApproach(final Integer[] array1, final Integer[] array2) {
        HashSet<Integer> firstArray = new HashSet<Integer>(Arrays.asList(array1));
        HashSet<Integer> result = new HashSet<Integer>(Arrays.asList(array1));

        result.removeAll(Arrays.asList(array2));
        firstArray.removeAll(result);
        System.out.println(firstArray);
    }

    // 2 sposob - czasowa O(N)
    private static void secondApproach(final Integer[] array1, final Integer[] array2) {
        HashSet<Integer> array1Elements = new HashSet<Integer>();
        for (Integer i : array1) {
            array1Elements.add(i);
        }

        HashSet<Integer> result = new HashSet<Integer>();
        for (Integer i : array2) {
            if(array1Elements.contains(i)) {
                result.add(i);
            }
        }
        System.out.println(result);
    }

    private static void firstApproach(final Integer[] array1, final Integer[] array2) {
        //1 sposób - z?y O(N^2)
        HashSet<Integer> result = new HashSet<Integer>();
        for (Integer a : array1) {
            for (Integer b : array2) {
                if(a.equals(b)) {
                    result.add(a);
                }
            }
        }
        System.out.println(result);
    }
}
