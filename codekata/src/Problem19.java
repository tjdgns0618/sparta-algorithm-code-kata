public class Problem19 {
    public static void main(String[] args) {
        Solution19 s = new Solution19();
        System.out.println(s.solution(121));
    }
}

class Solution19 {
    public long solution(long n) {
        long answer = 0;
        long sqrtNum = (long)Math.sqrt(n);
        if(sqrtNum * sqrtNum != n){
            answer = -1;
        } else {
            sqrtNum += 1;
            answer = sqrtNum * sqrtNum;
        }
        return answer;
    }
}