import java.util.Scanner;

public class Problem15 {
    public static void main(String args[]) {
        Solution15 s = new Solution15();
        System.out.println(s.solution(10));
    }
}

class Solution15 {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i < n; i++){
            if(n % i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}