import java.util.Arrays;

public class Problem39 {
    public static void main(String[] args) {
        Solution39 s = new Solution39();
        int n = 3;
        int m = 12;
        System.out.println(Arrays.toString(s.solution(n, m)));
    }
}

class Solution39 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int a = n;
        int b = m;

        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }

        answer[0] = a;
        answer[1] = (n * m) / a;



        return answer;
    }
}