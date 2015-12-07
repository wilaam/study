/**
 * Created by asus on 2015-12-06.
 */
public class FrogRiverOne {
    public static void main(String[] args) {
        int A[]={1,3,1,4,2,3,5,4};
        int X = 5;

        Solution3 frogRiverOne = new Solution3();
        System.out.println(frogRiverOne.solution3(X,A));
    }
}

class Solution3 {
    public int solution3(int X, int[] A) {

        boolean[] zawiera = new boolean[X+1];
        int licznik = 0;

        for (int i = 0 ; i < A.length ; i++){
            if (!zawiera[A[i]]){
                zawiera[A[i]]=true;
                licznik++;
            }
            if (licznik==X){
                return i;
            }
        }
        return -1;
    }
}