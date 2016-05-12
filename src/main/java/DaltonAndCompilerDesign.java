import java.util.Scanner;

public class DaltonAndCompilerDesign {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 0; i < testCase ; i++) {
            int number = scanner.nextInt();
            System.out.println(number/2+" "+(number+1)/2);
        }
    }
}
