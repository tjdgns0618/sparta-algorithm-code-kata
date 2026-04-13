public class Problem31 {
    public static void main(String[] args) {
        Solution31 s = new Solution31();
        System.out.println(s.solution(3));
        System.out.println(s.solution(4));
    }
}

class Solution31 {
    public String solution(int n) {
        String answer = "";
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                answer += "박";
            }else{
                answer += "수";
            }
        }
        return answer;
    }
}