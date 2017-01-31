import java.util.HashMap;
import java.util.Scanner;

public class PrintHackerearth2 {
    public static void main(String[] args) {
        char[] sentence = {'h', 'a', 'c', 'k', 'e', 'r', 'e', 'a', 'r', 't', 'h'};

        Scanner scanner = new Scanner(System.in);
        int amountLetters = scanner.nextInt();

        char[] letters = new char[amountLetters];
        letters = scanner.next().toCharArray();

        HashMap<Character, Integer> countSentence = new HashMap<Character, Integer>();
        for (char c : sentence) {
            if (countSentence.containsKey(c)) {
                countSentence.put(c, countSentence.get(c) + 1);
            } else
                countSentence.put(c, 1);
        }

        System.out.println(countSentence);

        HashMap<Character, Integer> countLetter = new HashMap<Character, Integer>();
        for (char c : letters) {
            if (countLetter.containsKey(c)) {
                countLetter.put(c, countLetter.get(c) + 1);

            } else
                countLetter.put(c, 1);
        }
        System.out.println(countLetter);

        int res = Integer.MAX_VALUE;
        int result = 0;

        for (char l : countSentence.keySet()) {
            if (countLetter.size() >= countSentence.size()) {
                int division = countLetter.get(l) / countSentence.get(l);
                res = Math.min(res, division);
                result = Math.abs(res);
            } else
                result = 0;
        }

        System.out.println(result);
    }
}
