import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Acronym2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountWord = scanner.nextInt();

        HashSet<String> word = new HashSet<String>();
        for (int i = 0; i < amountWord; i++) {
            String input = scanner.next();
            word.add(input);
        }

        int amountSentence = scanner.nextInt();
        String[] sentence = new String[amountSentence];
        //String text = scanner.nextLine();
        //sentence=text.split(" ");
        for (int i = 0; i < amountSentence ; i++) {
            sentence[i]=scanner.next();
        }

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
