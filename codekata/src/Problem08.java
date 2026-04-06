public class Problem08 {
    public static void main(String[] args) {
        Solution08 s = new Solution08();
        System.out.println(s.solution(70));
    }
}

class Solution08 {
    public int solution(int angle) {
        int answer =
        // 예각이면 1
        angle > 0 && angle < 90 ? 1 :
        // 직각이면 2
        angle == 90 ? 2 :
        // 둔각이면 3
        angle > 90 && angle < 180 ? 3 :
        // 평각이면 4
        angle == 180 ? 4 : 0;

        return answer;
    }
}