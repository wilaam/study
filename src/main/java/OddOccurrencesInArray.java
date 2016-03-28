
public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] A={9,3,9,3,9,7,9};
        SolutionOddOccurrencesInArray value = new SolutionOddOccurrencesInArray();
        System.out.println(value.solution(A));
    }
}

class SolutionOddOccurrencesInArray {
  public int solution(int A[]) {
        int result = 0;
        for (int i:A){
            result^=i;
        }
        return result;
    }
}
