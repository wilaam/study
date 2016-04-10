import java.util.Scanner;

public class MonkInTheRealEstate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountTestCases= scanner.nextInt();
        for (int q = 0; q < amountTestCases; q++) {
            int amountCities = scanner.nextInt();
            boolean[] city = new boolean[10001];
            int count = 0;
            for (int i = 0; i < amountCities; i++) {
                int firstCity=scanner.nextInt();
                if (!city[firstCity]){
                    city[firstCity]=true;
                    count++;
                }
                int secondCity = scanner.nextInt();
                if (!city[secondCity]){
                    city[secondCity]=true;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
