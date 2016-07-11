import java.util.Scanner;

public class LittleJhoolAndHisBreakup {
    public static void main(String[] args) {

        int z = 0;
        Scanner scanner = new Scanner(System.in);
        String text = "love";
        String message = scanner.nextLine();

        l1:
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == text.charAt(z)) {
                z++;
                if (z == text.length()) {
                    System.out.println("I love you, too!");
                    break l1;
                }
            }
        }
        if (z < text.length()) {
            System.out.println("Let us breakup!");
        }

    }
}
