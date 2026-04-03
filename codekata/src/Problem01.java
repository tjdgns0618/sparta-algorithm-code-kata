public class Problem01 {
    public static void main(String[] args){
        Solution01 solution = new Solution01();
        System.out.println(solution.solution(1,2));
    }
}

class Solution01 {
    public int solution(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }
}