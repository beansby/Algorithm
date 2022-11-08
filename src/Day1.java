import java.util.*;

public class Day1 {

    public int solution(int n) {
        // 1) 각 자리수의 합
        int answer = 0;
        // 2) n=0일때 반복문 중지
        while (n>0) {
            // 3) 1의 자리수 구하기 : 10으로 나눈 나머지
            answer += n % 10;
            // 4) 10으로 나눈 몫
            n /= 10;
        }
        return answer;
    }

}
