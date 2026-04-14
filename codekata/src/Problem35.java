public class Problem35 {
    public static void main(String[] args) {
        Solution35 s = new Solution35();
        int price = 3;
        int money = 20;
        int count = 4;
        System.out.println(s.solution(price, money, count));
    }
}

class Solution35 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i = 1; i <= count; i++){
            answer += price * i;
        }

        answer -= money;

        if(answer <= 0)
            return 0;

        return answer;
    }
}
