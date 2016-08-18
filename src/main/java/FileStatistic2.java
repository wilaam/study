import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileStatistic2 {
    public static void main(String[] args) throws IOException{

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Scanner scanner = new Scanner(System.in);
        String inputFile = scanner.next();
        File file = new File(inputFile);
        Scanner inFile = new Scanner(file);

        int lines = 0;
        int words = 0;
        int characters = 0;

        while(inFile.hasNextLine()){
            lines++;
            String line = inFile.nextLine();
            for (int i = 0; i <line.length(); i++) {
                if (line.charAt(i)!=' ' && line.charAt(i)!='\n'){
                    characters++;
                }
            }
            words+=new StringTokenizer(line,",;:.").countTokens();
        }

        System.out.println(lines);
        System.out.println(words);
        System.out.println(characters);
        System.out.println(Files.getOwner(file.toPath(), LinkOption.NOFOLLOW_LINKS));
        System.out.println("1000");
        System.out.println(file.lastModified());
        //System.out.println(sdf.format(file.lastModified()));
    }
}

