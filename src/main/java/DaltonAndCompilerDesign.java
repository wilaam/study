import java.util.Scanner;

public class DaltonAndCompilerDesign {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 0; i < testCase ; i++) {
            int number1=0;
            int number2=0;
            int help=100;
            int number = scanner.nextInt();
            for (int j = 1; j <= number/2 ; j++) {
               int result=j%(number-j);
                if (result<help){
                    help=result;
                    number1=j;
                    number2=number-j;
                }
            }
            System.out.println(number1+" "+number2);
        }
    }
}
