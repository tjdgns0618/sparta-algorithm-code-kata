public class Problem17 {
    public static void main(String[] args) {
        Solution17 s = new Solution17();
        int[] arr = s.solution(12345);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}

class Solution17 {
    public int[] solution(long n) {
        int count = (int)Math.log10(n) + 1;
        int[] answer = new int[count];
        double m = n;
        for(int i = 0; i < count; i++){
            m = n;
            for(int j = 0; j < i; j++){
                m = m / 10;
            }
            answer[i] = (int)(m % 10);
        }

        return answer;
    }
}