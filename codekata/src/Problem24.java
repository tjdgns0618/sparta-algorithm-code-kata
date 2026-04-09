public class Problem24 {
    public static void main(String[] args) {
        Solution24 s = new Solution24();
        String[] seoul = {"Jane", "Kim"};
        System.out.println(s.solution(seoul));
    }
}

class Solution24 {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }
        return answer;
    }
}