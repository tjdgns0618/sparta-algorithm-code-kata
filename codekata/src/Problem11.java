public class Problem11 {
    public static void main(String[] args) {
        Solution11 s = new Solution11();
        System.out.println(s.solution(3));
        System.out.println(s.solution(4));
    }
}

class Solution11 {
    public String solution(int num) {
        String answer = num % 2 == 0 ? "Even" : "Odd";
        return answer;
    }
}
