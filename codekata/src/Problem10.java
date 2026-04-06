public class Problem10 {
    public static void main(String[] args) {
        Solution10 s = new Solution10();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(s.solution(nums));
    }
}

class Solution10 {
    public double solution(int[] numbers) {
        double answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        return answer / numbers.length;
    }
}
