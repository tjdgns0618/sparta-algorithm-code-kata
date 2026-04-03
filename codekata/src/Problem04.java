public class Problem04 {
    public static void main(String[] args) {
        Solution04 solution = new Solution04();
        System.out.println(solution.solution(40));
    }
}

class Solution04 {
    public int solution(int age) {
        int answer = 2023 - age;
        return answer;
    }
}