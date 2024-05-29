package level1;
import java.util.*;
public class P155652 {
    public String solution(String s, String skip, int index) {
        StringBuffer sb = new StringBuffer();

        char[] chArray = s.toCharArray();
        char[] skipArray = skip.toCharArray();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < skipArray.length; i++){
            set.add(skipArray[i]);
        }

        for(int i = 0; i < chArray.length; i++){
            //1. 이동하면서 skip 검사 이때 z넘어가면 a로 돌아간다
            int ch = (int)chArray[i];
            for(int j = 0; j < index; j++){
                ch++;
                if(ch > 'z'){
                    ch = 'a';
                }
                while(set.contains((char)ch)){
                    ch++;
                    if(ch > 'z'){
                        ch = 'a';
                    }
                }
            }

            //2. string으로 변환하여 sb에 할당
            sb.append(String.valueOf((char)ch));
        }

        return sb.toString();
    }
}
