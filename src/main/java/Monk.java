import java.util.Scanner;

/**
 * Created by stawicad on 2016-04-06.
 */
public class Monk {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int q = 0; q < t; q++) {
            int e = sc.nextInt();
            boolean[] city= null;
            int count = 0;
            for (int i = 0; i < e; i++) {
                System.out.println("procesujue droge wcyhodzaca z "+sc.nextInt()+" prowadzaca do " +sc.nextInt());
                count++;
            }
            System.out.println(count);
        }
    }
}
