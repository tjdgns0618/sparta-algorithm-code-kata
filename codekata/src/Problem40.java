public class Problem40 {
    public static void main(String[] args) {
        Solution40 s = new Solution40();
        System.out.println(s.solution(45));
    }
}

class Solution40 {
    public int solution(int n) {

        String changed = Integer.toString(n, 3);
        String reversed = "";
        for(int i = changed.length() - 1; i >= 0; i--){
            reversed += changed.charAt(i);
        }
        int answer = Integer.parseInt(reversed, 3);

        return answer;
    }
}