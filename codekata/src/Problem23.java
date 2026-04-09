public class Problem23 {
    public static void main(String[] args) {
        Solution23 s =  new Solution23();
        System.out.println(s.solution(626331));
    }
}

class Solution23 {
    public int solution(int num) {
        if(num == 1)
            return 0;

        int count = 1;
        long n = num;
        while(count != 500){
            n = (n % 2 == 0) ? (n / 2) : (n * 3 + 1);
            if(n == 1)
                return count;
            count++;
        }

        return -1;
    }
}