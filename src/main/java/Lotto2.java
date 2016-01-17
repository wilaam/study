import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by asus on 2015-12-13.
 */
public class Lotto2 {

    static String name;

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Program lotto");
        System.out.println("Ile razy chcesz wylosować liczby 1 z 49 ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        int amount = Integer.parseInt(text);

        int[][] lottoResult = drawALots(amount);

        //todo: extract printing to new method
        printResult(lottoResult);
        printToFile(lottoResult);
    }

    private static void printResult(int[][] lottoResult) throws FileNotFoundException {
        for (int i = 0; i < lottoResult.length; i++) {
            for (int j = 0; j < lottoResult[i].length; j++) {
                System.out.print(lottoResult[i][j] + ",");
            }
            System.out.println("");
        }
        PrintStream out = new PrintStream("./test.txt");
        out.println("hello");
        out.flush();
    }

    private static void printToFile(int[][] lottoResult) throws FileNotFoundException{
        PrintStream out = new PrintStream("./result.txt");
        for (int i = 0; i <lottoResult.length ; i++) {
            for (int j = 0; j <lottoResult[i].length ; j++) {
                out.print(lottoResult[i][j] + ",");
            }
            out.println();
        }
        out.flush();
    }

    private static int[][] drawALots(int amount) {
        Random random = new Random();
        int[][] lottoResult = new int[amount][6];

        for (int i = 0; i < lottoResult.length; i++) {
            for (int j = 0; j < lottoResult[i].length; j++) {
                lottoResult[i][j] = (random.nextInt(49) + 1);
                while (contains(lottoResult[i], j))
                    lottoResult[i][j] = (random.nextInt(49) + 1);
            }
            Arrays.sort(lottoResult[i]);
        }
        return lottoResult;
    }

    private static boolean contains(int[] lottoResult, int j) {
        for (int i = 0; i < j; i++) {
            if (lottoResult[j] == lottoResult[i]) {
                return true;
            }
        }
        return false;
    }
}





