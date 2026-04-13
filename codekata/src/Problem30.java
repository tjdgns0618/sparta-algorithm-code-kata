public class Problem30 {
    public static void main(String[] args) {
        Solution30 s = new Solution30();
        String str = "abcde";
        String str2 = "qwer";
        System.out.println(s.solution(str));
        System.out.println(s.solution(str2));
    }
}

class Solution30{
    public String solution(String s) {
        int length = s.length();
        String answer;
        if(length % 2 == 0)
            answer = s.substring(length / 2 - 1, length / 2 + 1);
        else
            answer = s.substring(length / 2, length / 2 + 1);
        return answer;
    }
}