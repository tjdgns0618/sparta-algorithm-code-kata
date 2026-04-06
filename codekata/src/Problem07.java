public class Problem07 {
    public static void main(String[] args) {
        Solution07 s = new Solution07();
        System.out.println(s.solution(3,2));
    }
}

class Solution07 {
    public int solution(int num1, int num2) {
        int answer = (1000 * num1) / num2;
        return answer;
    }
}
