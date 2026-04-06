public class Problem13 {
    public static void main(String[] args) {
        Solution13 s = new Solution13();
        Solution13_1 s1 = new Solution13_1();
        // String을 이용하는 것은 객체 생성을 하기 때문에 무겁다.
        System.out.println(s.solution(123));
        // 단순 계산으로 풀이하는 것이 실행속도가 500배 이상 차이난다.
        System.out.println(s1.solution(123));

    }
}

class Solution13 {
    public int solution(int n) {
        int answer = 0;
        String str = n + " ";

        for(int i = 0; i < str.length() - 1; i++){
            answer += str.charAt(i) - '0';
        }

        return answer;
    }
}

class Solution13_1 {
    public int solution(int n) {
        int answer = 0;

        while(true){
            answer+=n%10;
            if(n<10)
                break;

            n=n/10;
        }

        return answer;
    }
}