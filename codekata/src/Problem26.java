public class Problem26 {
    public static void main(String[] args) {
        Solution26 s = new Solution26();
        int[] absolutes = {4,7,12};
        boolean[] signs = {true, false, true};
        System.out.println(s.solution(absolutes, signs));
    }
}

class Solution26 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < absolutes.length; i++){
            if(signs[i])
                answer += absolutes[i];
            else
                answer -= absolutes[i];
        }

        return answer;
    }
}