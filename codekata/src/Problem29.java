import java.util.Arrays;

public class Problem29 {
    public static void main(String[] args) {
        Solution29 s = new Solution29();
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(s.solution(arr)));
    }
}

class Solution29 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int minNum = arr[0];
        for(int num : arr){
            minNum = Math.min(minNum, num);
        }
        int count = 0;
        for(int num : arr){
            if(num == minNum)
                continue;
            answer[count++] = num;
        }

        if(arr.length == 1)
            return new int[] {-1};

        return answer;
    }
}
