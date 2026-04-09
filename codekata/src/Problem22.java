public class Problem22 {
    public static void main(String[] args) {
        Solution22 s = new Solution22();
        System.out.println(s.solution(5,3));
    }
}

class Solution22 {
    public long solution(int a, int b) {
        long answer = 0;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        for(long i = min; i <= max; i++){
            answer += i;
        }
        return answer;
    }
}