public class Problem12 {
    public static void main(String[] args) {
        Solution12 s = new Solution12();
        int[] arr = {1,2,3,4};
        System.out.println(s.solution(arr));
    }
}

class Solution12 {
    public double solution(int[] arr) {
        double answer = 0;
        for(int num : arr)
            answer += num;
        return answer / arr.length;
    }
}