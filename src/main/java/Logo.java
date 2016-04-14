import java.util.Scanner;

/**
 * Created by stawicad on 2016-04-13.
 */
public class Logo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        int number = Integer.parseInt(value);
        int helpValue = 1;
        int number2 = number;
        for (int row = 0; row < number; row++) {
            for (int j = 0; j < number - row - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < row/2 ; k++) {
                System.out.print("/ ");
            }
            if (row%2==0){
                System.out.print("/\\");
            }
            else {
                System.out.print("/  \\");
            }

            for (int k = 0; k < row/2 ; k++) {
                System.out.print(" \\");
            }

             helpValue++;
            System.out.println("");
           // System.out.println(row/2 + 1);
            number2--;
        }
    }
}
