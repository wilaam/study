import java.util.Scanner;

public class PalindromicString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        String reverse="";
        for (int i = text.length()-1; i >= 0 ; i--) {
            reverse+=text.charAt(i);
        }
        if (reverse.equals(text)){
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}