import java.util.Arrays;

public class Problem25 {
    public static void main(String[] args) {
        Solution25 s = new Solution25();
        int[] arr = {5,9,7,10};
        int divisor = 5;
        System.out.println(Arrays.toString(s.solution(arr, divisor)));
    }
}

class Solution25 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(i -> i % divisor == 0).toArray();

        if(answer.length == 0)
            return new int[] {-1};

        Arrays.sort(answer);

        return answer;
    }
}