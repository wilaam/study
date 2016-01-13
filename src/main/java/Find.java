import java.io.File;

/**
 * Created by stawicad on 2016-01-13.
 */
public class Find {
    public static void main(String[] args) {
        File currentFile = new File(args[0]);
        printFile(currentFile);
    }

    private static void printFile(File currentFile) {
        for (int i = 0; i <currentFile.listFiles().length ; i++) {
            System.out.println(currentFile.listFiles()[i]);

            if (currentFile.listFiles()[i].isDirectory()){
                printFile(currentFile.listFiles()[i]);
            }
        }
    }
}
