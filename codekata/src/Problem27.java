public class Problem27 {
    public static void main(String[] args) {
        Solution27 s = new Solution27();
        String phone_number = "01033334444";
        System.out.println(s.solution(phone_number));
    }
}

class Solution27 {
    public String solution(String phone_number) {
        char[] answer = phone_number.toCharArray();
        for(int i = 0; i < phone_number.length() - 4; i++)
            answer[i] = '*';

        return String.valueOf(answer);
    }
}
