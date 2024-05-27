package level1;
import java.util.*;

public class P77484 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCnt = 0;
        List<Integer> lottoList = new ArrayList<>();
        List<Integer> winList = new ArrayList<>();

        //1. 각 리스트에 배열 할당
        for(int i = 0; i < 6; i++){
            lottoList.add(lottos[i]);
            winList.add(win_nums[i]);
            if(lottos[i] == 0){
                zeroCnt++;
            }
        }

        //2. 겹치는 수 갯수
        winList.retainAll(lottoList);
        int winNumCnt = winList.size();

        //3. 로또 가능 범위 계산
        //3-1. 최고 순위
        answer[0] = getRank(winNumCnt + zeroCnt);
        answer[1] = getRank(winNumCnt);
        return answer;
    }

    public int getRank(int cnt){
        if(cnt == 6){
            return 1;
        }else if(cnt == 5){
            return 2;
        }else if(cnt == 4){
            return 3;
        }else if(cnt == 3){
            return 4;
        }else if(cnt == 2){
            return 5;
        }
        return 6;
    }
}
