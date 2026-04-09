public class Problem21 {
    public static void main(String[] args) {
        Solution21 s = new Solution21();
        System.out.println(s.solution(12));
        System.out.println(s.solution(13));
    }
}

class Solution21 {
    public boolean solution(int x) {
        int sum = 0;
        int num = x;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        if(x % sum == 0)
            return true;
        else
            return false;
    }
}