import java.util.Scanner;

public class LittleJhoolAndBruteForce2 {
    public static void main(String[] args) {
        int[] cubeRoot = new int[3917];
        int[] occurrence = new int[7049770];
        int[] searchCube = new int[34];
        int l = 0;
        int value = 0;
        for (int i = 0; i < 89; i++) {
            for (int j = i + 1; j < 89; j++) {
                value = i * i * i + j * j * j;
                cubeRoot[l]=value;
                l++;
            }
        }

        for (int k = 0; k <cubeRoot.length ; k++) {
            occurrence[cubeRoot[k]]++;
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
            for (int j = 1; j < searchCube.length+1; j++) {
                if (numberGives<=searchCube[0]){
                    System.out.println("-1");
                    break;
                }

                if (numberGives<=searchCube[j]){
                    System.out.println(searchCube[j-1]);
                    break;
                }

            }

        }

    }

}
