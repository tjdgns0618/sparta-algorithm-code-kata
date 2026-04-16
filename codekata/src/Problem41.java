public class Problem41 {
    public static void main(String[] args) {
        Solution41 s = new Solution41();
        String str = "try hello world";
        System.out.println(s.solution(str));
    }
}

class Solution41 {
    public String solution(String s) {
        // char배열로 만든뒤 하나씩 변경후 그대로 String.valueOf로 반환하는게 효율이 좋음
        // String배열로 만들어서 해결을 하면 값이 비싸짐 속도가 200배 이상 차이남
        char[] arr = s.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ')
                count = 0;
            else
                arr[i] = (count++ % 2 == 0 ? Character.toUpperCase(arr[i]) : Character.toLowerCase(arr[i]));
        }
        return String.valueOf(arr);
    }
}