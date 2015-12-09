import java.util.Random;

/**
 * Created by stawicad on 2015-12-09.
 */
public class Lotto {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lottoResult = new int[6];

        for (int i = 0; i < lottoResult.length ; i++) {
            lottoResult[i]=random.nextInt(49)+1;
            while (contains(lottoResult,i)){
                lottoResult[i]=random.nextInt(49)+1;
            }

        }
        for (int i = 0; i <lottoResult.length ; i++) {
            System.out.println(lottoResult[i]);
        }

    }

    private static boolean contains(int[] lottoResult, int i) {
        for (int j = 0; j < i; j++) {
          if (lottoResult[i]==lottoResult[j]){
                return  true;
            }

        }
        return false;
    }
}
