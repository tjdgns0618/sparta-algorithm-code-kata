import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Solution03 solution = new Solution03();
        System.out.println(solution.solution(7, 2));

    }
}

class Solution03 {
    public int solution(int num1, int num2) {
        int answer = num1 / num2;
        return answer;
    }
}