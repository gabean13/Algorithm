package level1;

import java.util.LinkedList;
import java.util.Queue;

public class P161989 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        //1. queue에 section을 넣는다
        for(int i = 0; i < section.length; i++){
            queue.add(section[i]);
        }

        //2. 제일 앞에 있는 애들부터 칠해준다
        while(!queue.isEmpty()){
            Integer fq = queue.remove();
            while(!queue.isEmpty() && queue.peek() < fq + m){
                queue.remove();
            }
            answer++;
        }
        return answer;
    }
}
