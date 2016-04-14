import java.util.Scanner;

public class RahulsLogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberInString = scanner.nextLine();
        Integer number = Integer.parseInt(numberInString);

        for (int row = 0; row < number; row++) {
            for (int j = 0; j < number - row - 1; j++) {
                System.out.print(" ");
            }
            for (int i = 0; i < row / 2; i++) {
                System.out.print("/ ");
            }
            if (row % 2 == 0) {
                System.out.print("/\\");
            } else {
                System.out.print("/  \\");
            }
            for (int i = 0; i < row/2; i++) {
                System.out.print(" \\");
            }
            System.out.println("");
        }

        for (int row = 0; row < number; row++) {

            for (int k = 0; k < 2 + row; k++) {
                System.out.print(" ");
            }
            for (int i = 0; i < (number - row -1)/2; i++) {
                System.out.print("\\ ");
            }
            if ((number - row -1) % 2 == 0) {
                System.out.print("\\/");
            } else {
                System.out.print("\\  /");
            }
            for (int i = 0; i < (number - row -1)/2; i++) {
                System.out.print(" /");
            }
            System.out.println("");
        }

        //===================================
        for (int row = 0; row < number+1; row++) {
            for (int j = 0; j < number+1 - row - 1; j++) {
                System.out.print(" ");
            }
            for (int i = 0; i < row / 2; i++) {
                System.out.print("/ ");
            }
            if (row % 2 == 0) {
                System.out.print("/\\");
            } else {
                System.out.print("/  \\");
            }
            for (int i = 0; i < row/2; i++) {
                System.out.print(" \\");
            }
            System.out.println("");
        }

        for (int row = 0; row < number+1; row++) {

            for (int k = 0; k < 2 + row; k++) {
                System.out.print(" ");
            }
            for (int i = 0; i < (number - row )/2; i++) {
                System.out.print("\\ ");
            }
            if ((number - row) % 2 == 0) {
                System.out.print("\\/");
            } else {
                System.out.print("\\  /");
            }
            for (int i = 0; i < (number - row)/2; i++) {
                System.out.print(" /");
            }
            System.out.println("");
        }
    }
}