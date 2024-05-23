package level1;

import java.util.*;

public class P178871 {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playersMap = new HashMap<>();

        //선수 순위를 빠르게 검색하기 위한 HashMap
        for (int i = 0; i < players.length; i++) {
            playersMap.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            int callingRank = playersMap.get(callings[i]);

            //불린 선수의 앞 선수와 swap
            String temp = players[callingRank - 1];
            players[callingRank - 1] = players[callingRank];
            players[callingRank] = temp;

            //hashmap 갱신
            playersMap.put(players[callingRank - 1], callingRank - 1);
            playersMap.put(players[callingRank], callingRank);
        }

        return players;
    }
}


