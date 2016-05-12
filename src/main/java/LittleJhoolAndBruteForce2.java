import java.util.ArrayList;
import java.util.Scanner;

public class LittleJhoolAndBruteForce2 {
    public static void main(String[] args) {
        ArrayList<Integer> cubeRoot = new ArrayList<Integer>();
        int[] occurrence = new int[7049770];
        int[] searchCube = new int[35];
        searchCube[34] = 704977;
        int value = 0;
        for (int i = 0; i < 89; i++) {
            for (int j = i + 1; j < 89; j++) {
                value = i * i * i + j * j * j;
                cubeRoot.add(value);
            }
        }

        for (int k = 0; k <cubeRoot.size() ; k++) {
            occurrence[cubeRoot.get(k)]++;
        }
        int help = 0;
        for (int z = 0; z < occurrence.length ; z++) {
            if (occurrence[z]>=2){
                searchCube[help]=z;
                help++;
            }
        }

        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 0; i < testCase ; i++) {
            int numberGives = scanner.nextInt();
            for (int j = 1; j < searchCube.length; j++) {
                if (numberGives<=searchCube[0]){
                    System.out.println("-1");
                    break;
                }

                if (numberGives<=searchCube[j]){
                    System.out.println(searchCube[j - 1]);
                    break;
                }

            }

        }

    }

}
