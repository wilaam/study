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

        for (int i = 0; i < args.length; i++) {
            if (args[i].contains("-name")){
                nameValue=args[i+1];
            }
            if (args[i].contains("-contains")){
                containsValue=args[i+1];
            }
        }

        printFile(currentFile, nameValue, containsValue);
    }

    private static void printFile(File currentFile, String nameValue, String containsValue) throws FileNotFoundException {
        for (int i = 0; i < currentFile.listFiles().length; i++) {
            File file = currentFile.listFiles()[i];
            if (nameValue == null) {
                System.out.println(file);
            } else {
                if (file.getName().equals(nameValue) && (containsText(file, containsValue))) {
                    System.out.println(file);
                }
            }
            if (file.isDirectory()) {
                printFile(file, nameValue, containsValue);
            }
        }
    }

    private static boolean containsText(File currentFile, String containsValue) throws FileNotFoundException {
        if(currentFile.isDirectory()) {
            return false;
        }

        if(containsValue==null){
            return false;
        }
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
