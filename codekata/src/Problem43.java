public class Problem43 {
    public static void main(String[] args) {
        Solution43 s = new Solution43();
        System.out.println(s.solution("3141592", "271"));
    }
}

class Solution43 {
    public int solution(String t, String p) {
        int answer = 0;
        long targetNum = Long.parseLong(p);
        // t길이 - p길이 + 1 : 부분 문자열의 갯수 구하는 공식
        for(int i = 0; i <= t.length() - p.length(); i++){
            String str = t.substring(i, i + p.length());
            long num = Long.parseLong(str);
            if(num <= targetNum)
                answer++;
        }

        return answer;
    }
}