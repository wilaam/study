import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStatistics  {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String inputFile = scanner.next();
        File file = new File(inputFile);

        Scanner output = new Scanner(file);

        int lines = 0;
        int words = 0;
        int characters = 0;

        while (output.hasNextLine()){
            output.nextLine();
            lines++;
        }
        System.out.println(lines);

        while (output.hasNext()){
            output.next();
            words++;
        }
        System.out.println(words);

        while (output.hasNextByte()){
            output.nextByte();
            characters++;
        }
        System.out.println(characters);

    }


}
