import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by stawicad on 2016-06-29.
 */
public class Exec {

    public static void main(String[] args) throws IOException {
        final Process exec = Runtime.getRuntime().exec("ps ax");
        final Scanner scanner = new Scanner(exec.getInputStream());
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("MD%05d", i));
        }
    }
}
