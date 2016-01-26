import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by stawicad on 2016-01-13.
 */
public class Find {
    public static void main(String[] args) throws FileNotFoundException {
        File currentFile = new File(args[0]);
        String nameValue = null;
        String containsValue = null;

        if (args.length > 1 && args[1].equals("-name")) {
            nameValue = args[2];
        }
        if (args.length > 1 && args[3].equals("-contains")) {
            containsValue = args[4];
        }
        printFile(currentFile, nameValue, containsValue);
    }

    private static void printFile(File currentFile, String nameValue, String containsValue) throws FileNotFoundException {
        for (int i = 0; i < currentFile.listFiles().length; i++) {
            File file = currentFile.listFiles()[i];
            if (nameValue == null) {
                System.out.println(file);
            } else {
                if (file.getName().equals(nameValue) && (containsText(currentFile, containsValue))) {
                    System.out.println(file);
                }
            }
            if (file.isDirectory()) {
                printFile(file, nameValue, containsValue);
            }
        }
    }

    private static boolean containsText(File currentFile, String containsValue) throws FileNotFoundException {
        Scanner scanner = new Scanner(currentFile);
        while (scanner.hasNext()) {
            String textInLine = scanner.nextLine();
            if (textInLine.contains(containsValue)) {
                return true;
            }
        }
        return false;
    }
}
