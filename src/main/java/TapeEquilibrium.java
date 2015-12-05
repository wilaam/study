/**
 * Created by stawicad on 2015-11-20.
 */
public class TapeEquilibrium {
    public static void main(String[] args) {
        int A[]={3,1,2,4,3};

        TapeEquilibrium firstClass = new TapeEquilibrium();
            System.out.println(firstClass.solution(A));
    }

    public int solution(int[] A) {
        int n = A.length;
        int min=Integer.MAX_VALUE;

        for (int i = 0; i < n-1 ; i++) {
            int suma1 = 0;
            int suma2 = 0;
            for (int j = 0; j <= i ; j++) {
                suma1=A[j]+suma1;
            }

            for (int j = i+1; j < n ; j++) {
                suma2=A[j]+suma2;
            }

            int current = Math.abs(suma1-suma2);

            if (current<min){
                min=current;
            }
        }
        return min;
    }

}


