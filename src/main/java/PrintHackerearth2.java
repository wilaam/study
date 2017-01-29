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

        int help = 0;
        int res = Integer.MAX_VALUE;
        l1:
        for (int i = 0; i < countSentence.size(); i++) {
            for (int j = 0; j < countLetter.size(); j++) {

                if (countSentence.size() > countLetter.size()) {
                    help = 1;
                    break l1;
                }

                if (!countSentence.keySet().equals(countLetter.keySet())) {
                    help = 1;
                    break l1;
                } else
                    for (char l : countSentence.keySet()) {
                        res = Math.min(res, countLetter.get(l) / countLetter.get(l));
                    }
            }
        }
        if (help == 0) {
            System.out.println(res);
        } else {
            System.out.println(-1);
        }
    }
}
