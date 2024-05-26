package level1;
import java.util.*;

public class P42889 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Arrays.sort(stages);
        Map <Integer, Integer> hm = new HashMap<>();
        Map <Integer, Double> rm = new HashMap<>();

        //맵에 <스테이지 : 클리어하지못한 플레이어수> 할당
        for(int i = 0; i < stages.length; i++){
            hm.put(stages[i], hm.getOrDefault(stages[i], 0)+1);
        }

        //i번째 스테이지 실패율 저장
        int playerCnt = stages.length;
        for(int i = 1; i <= N; i++){
            if(hm.containsKey(i)){
                int failPlayerCnt = hm.get(i);
                rm.put(i, (double)failPlayerCnt / playerCnt);
                playerCnt -= failPlayerCnt;
            }else{
                //실패율 무조건 0
                rm.put(i, 0.0);
            }
        }

        //value 기준으로 내림차순 정렬
        List<Integer> keySet = new ArrayList<>(rm.keySet());

        keySet.sort((o1, o2) -> rm.get(o2).compareTo(rm.get(o1)));

        int i =0;
        for(int key : keySet){
            answer[i++] = key;
        }

        return answer;
    }
}
