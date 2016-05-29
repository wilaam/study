import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Acronym2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int amountWord = scanner.nextInt();

        HashSet<String> word = new HashSet<String>();
        for (int i = 0; i < amountWord; i++) {
            String input = scanner2.nextLine();
            word.add(input);
        }

        int amountSentence = scanner.nextInt();
        String[] sentence = new String[amountSentence];
        String text = scanner2.nextLine();
        sentence=text.split(" ");


        List<String> result = new ArrayList<String>();
        for (String S: sentence){
            if(!word.contains(S)){
                result.add(S);
            }
        }

        for (int i = 0; i <result.size() ; i++) {
            System.out.print(Character.toUpperCase(result.get(i).charAt(0)));
            if (i< result.size()-1){
                System.out.print(".");
            }
        }
    }
}
