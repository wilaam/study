import java.util.ArrayList;
import java.util.Scanner;

public class Acronym {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountWord = scanner.nextInt();
        String[] words = new String[amountWord];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < amountWord ; i++) {
         String text = input.nextLine();
            words[i]=text;
        }

        int amountSentence = scanner.nextInt();
        String[] sentence = new String[amountSentence];
        String text = input.nextLine();
        sentence=text.split(" ");

        ArrayList<String> result = new ArrayList<String>();
        boolean tmp = true;
        for (int i = 0; i < sentence.length; i++) {
            tmp = true;
            for (int j = 0; j < words.length; j++) {
                if (sentence[i].equals(words[j])) {
                    tmp = false;
                    break;
                }
            }
            if(tmp) {
                result.add(sentence[i]);
            }
        }

        for (int i = 0; i <result.size(); i++) {
            System.out.print(Character.toUpperCase(result.get(i).charAt(0)));
            if (i<result.size()-1){
                System.out.print(".");
            }
        }
    }
}
