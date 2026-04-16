public class Problem42 {
    public static void main(String[] args) {
        Solution42 s = new Solution42();
        int[] number = {-3,-2,-1,0,1,2,3};
        System.out.println(s.solution(number));
    }
}

class Solution42 {
    public int solution(int[] number) {
        int answer = 0;
        int start = 0;
        // start와 next를 하나 증가 후 나머지 한번씩 더해보기
        while(start != number.length - 1){
            for(int i = start + 1; i < number.length - 1; i++){
                for(int j = i + 1; j < number.length; j++)
                    if(number[start] + number[i] + number[j] == 0){
                        answer++;
                    }
            }
            start++;
        }

        return answer;
    }
}
