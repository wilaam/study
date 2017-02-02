import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userText = scanner.next();

        for (int i = 0; i < userText.length() ; i++) {
            char c = userText.charAt(i);
            if (Character.isLowerCase(c)){
                c=Character.toUpperCase(c);
            }
            else
            {
                c=Character.toLowerCase(c);
            }
            System.out.print(c);
        }

    }

}
