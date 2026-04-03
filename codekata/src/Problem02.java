public class Problem02 {
    public static void main(String[] args) {
        Solution02  solution = new Solution02();
        System.out.println(solution.solution(27,19));
    }
}

class Solution02 {
    public int solution(int num1, int num2) {
        int answer = num1 * num2;
        return answer;
    }
}