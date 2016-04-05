import java.util.Scanner;


public class LittleJhoolAndPsychicPowers {
    public static void main(String[] args) {
        System.out.println("Please add binary number");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String[] binaryNumber = new String[1];
        int count = 1;

        for (int i = 0; i < binaryNumber.length; i++) {
            binaryNumber[i] = text;
            for (int j = 1; j < binaryNumber[i].length(); j++) {
                if (binaryNumber[i].charAt(j) == '1') {
                    if (binaryNumber[i].charAt(j) == binaryNumber[i].charAt(j - 1)) {
                        count++;
                    }
                }
            }
            if (count == 6) {
                System.out.println("Sorry, sorry!");
            } else System.out.println("Good luck!");
        }
    }
}
