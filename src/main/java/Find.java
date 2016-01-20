import java.io.File;

/**
 * Created by stawicad on 2016-01-13.
 */
public class Find {
    public static void main(String[] args) {
        File currentFile = new File(args[0]);
        String nameValue = null;
        if (args.length > 1 && args[1].equals("-name")) {
            nameValue = args[2];
        }
        
        printFile(currentFile, nameValue);
    }

    private static void printFile(File currentFile, String nameValue) {
        for (int i = 0; i < currentFile.listFiles().length; i++) {
            File file = currentFile.listFiles()[i];
            if (nameValue == null) {
                System.out.println(file);
            }
            else {
                if (file.getName().equals(nameValue)) {
                    System.out.println(file);
                }
            }
            if (file.isDirectory()) {
                printFile(file, nameValue);
            }
        }
    }
}
