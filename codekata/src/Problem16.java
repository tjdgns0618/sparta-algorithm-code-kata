public class Problem16 {
    public static void main(String[] args) {
        Solution16 s = new Solution16();
        long[] longs = s.solution(2,5);
        for(long l:longs){
            System.out.print(l + " ");
        }
        System.out.println();
    }
}

class Solution16 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 1; i <= n; i++){
            answer[i - 1] = (long)x * i;
        }
        return answer;
    }
}
