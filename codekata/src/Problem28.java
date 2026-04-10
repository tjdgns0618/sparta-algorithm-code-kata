public class Problem28 {
    public static void main(String[] args) {
        Solution28 s = new Solution28();
        int[] numbers = {1,2,3,4,6,7,8,0};
        System.out.println(s.solution(numbers));
    }
}

class Solution28 {
    public int solution(int[] numbers) {
        int answer = 45;
        for (int number : numbers) {
            answer -= number;
        }

        return answer;
    }
}