public class Problem05 {
    public static void main(String[] args) {
        Solution05 solution = new Solution05();
        System.out.println(solution.solution(2, 3));
        System.out.println(solution.solution(3, 3));
    }
}

class Solution05 {
    public int solution(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }
}