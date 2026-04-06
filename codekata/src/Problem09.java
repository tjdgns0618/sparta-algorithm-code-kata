public class Problem09 {
    public static void main(String[] args) {
        Solution09 s = new Solution09();
        System.out.println(s.solution(10));
    }
}

class Solution09 {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        while(i <= n){
            if(i % 2 == 0)
                answer += i;
            i++;
        }
        return answer;
    }
}