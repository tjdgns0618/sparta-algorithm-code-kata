public class Problem33 {
    public static void main(String[] args) {
        Solution33 s = new Solution33();
        int left = 13;
        int right = 17;
        System.out.println(s.solution(left,right));
    }
}

class Solution33 {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++){
            int count = 0;
            for(int j = 1; j <= i / 2; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count % 2 == 0)
                answer -= i;
            else
                answer += i;
        }
        return answer;
    }
}