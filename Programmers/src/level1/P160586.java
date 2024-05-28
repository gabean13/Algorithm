package level1;
import java.util.*;

public class P160586 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        List<Map<String, Integer>> lm = new ArrayList<>();

        //1. keymap을 lm에 할당한다
        for(int i = 0; i < keymap.length; i++){
            String[] str = keymap[i].split("");
            Map<String, Integer> hm = new HashMap<>();
            for(int j = 0; j < str.length; j++){
                hm.put(str[j], hm.getOrDefault(str[j], j+1));
            }
            lm.add(hm);
        }

        //2. target 마다 눌러야하는 수 계산
        for(int i = 0; i < targets.length; i++){
            int cnt = 0;
            String[] str = targets[i].split("");
            for(int j = 0; j < str.length; j++){
                int minCnt = lm.get(0).get(str[j]) == null ? 1000 : lm.get(0).get(str[j]);
                for(int k = 0; k < lm.size(); k++){
                    int currentCnt = lm.get(k).get(str[j]) == null ? 1000 : lm.get(k).get(str[j]);
                    if(currentCnt < minCnt){
                        minCnt = currentCnt;
                    }
                }
                cnt += minCnt;
                if(minCnt == 1000){
                    cnt = -1;
                    break;
                }
            }
            answer[i] = cnt;
        }

        for(int i = 0; i < lm.size(); i++){
            System.out.println(lm.get(i));
        }

        return answer;
    }
}
