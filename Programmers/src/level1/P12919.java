package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P12919 {
    public String solution(String[] seoul) {
        int index = 0;
        List<String> seoulList = new ArrayList<>(Arrays.asList(seoul));

        for(int i = 0; i < seoulList.size(); i++){
            if(seoulList.get(i).equals("Kim")){
                index = i;
                break;
            }
        }

        return "김서방은 " +index+ "에 있다";
    }
}
