public class Problem22 {
    public static void main(String[] args) {
        Solution22 s = new Solution22();
        System.out.println(s.solution(5,3));
    }
}

class Solution22 {
    public long solution(int a, int b) {
        long answer = 0;
        long min = Math.min(a, b);
        long max = Math.max(a, b);
        // 등차수열의 합 공식
        return (max - min + 1) * (max + min) / 2;
    }
}