import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by asus on 2015-12-13.
 */
public class Lotto2 {

    public static void main(String[] args) {
        System.out.println("Program lotto");
        System.out.println("Ile razy chcesz wylosować liczby 1 z 49 ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        int amount = Integer.parseInt(text);

        Random random = new Random();
        int[][] lottoResult = new int[amount][6];

        for (int i = 0; i < lottoResult.length; i++) {
            for (int j = 0; j < lottoResult[i].length; j++) {
                lottoResult[i][j] = (random.nextInt(49) + 1);
                while (contains(lottoResult,i,j))
                    lottoResult[i][j] = (random.nextInt(49) + 1);
            }
        }



        for (int i = 0; i < lottoResult.length; i++) {
            for (int j = 0; j < lottoResult[i].length; j++) {
                System.out.print(lottoResult[i][j] + ",");
            }
            System.out.println("");
        }
    }

    private static boolean contains(int[][] lottoResult, int i, int j) {
        for (int k = 0; k < i ; k++) {
            for (int l = 0; l < j ; l++) {
                if (lottoResult[k][l]==lottoResult[i][j]){
                    return true;
                }
            }
        }
        return  false;
    }
}



