import java.util.Arrays;

public class Problem34 {
    public static void main(String[] args) {
        Solution34 s = new Solution34();
        System.out.println(s.solution("Zbcdefg"));
    }
}

class Solution34 {
    public String solution(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        StringBuilder sb = new StringBuilder(new String(charArr));
        return sb.reverse().toString();
    }
}