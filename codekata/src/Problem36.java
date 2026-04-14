public class Problem36 {
    public static void main(String[] args) {
        Solution36 s = new Solution36();
        System.out.println(s.solution("a234"));
        System.out.println(s.solution("1234"));
    }
}

class Solution36 {
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6)
            return false;

        return s.matches("[0-9]+");
    }
}