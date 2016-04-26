import java.util.Scanner;

/**
 * Created by asus on 2016-04-25.
 */
public class LittleJhoolAndBruteForce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        int count = 0;
        double value = 0;
        for (int i = 0; i < testCase; i++) {
            int numberGives = scanner.nextInt();
            for (int k = numberGives; k > 0; k--) {
                for (int j = 1; j < k; j++) {
                    double x = Math.cbrt(j);
                    if (x == (int) x) {
                        for (int l = 1; l < k; l++) {
                            double y = Math.cbrt(l);
                            if (y == (int) y) {
                                value = x * x * x + y * y * y;
                                if (value == k) {
                                    count++;
                                }
                                if (count == 2) {
                                    break;
                                }
                            }
                        }
                    }
                }


            }
            if (count == 2) {
                System.out.println(value);

            } else {
                System.out.println("-1");
            }
        }
    }
}
