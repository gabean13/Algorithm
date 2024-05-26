package softear;
import java.io.*;
import java.util.*;

public class pr1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String input = br.readLine();

        String[] array = input.split(" ");

        /**
         * 만약 입력이 6개 이하 => 3자리 자연수 포함
         * 6이상인데 3자리 포함이면 -1
         */
        if(array.length > 9){
            System.out.println("-1");
            return;
        }

        if(array.length > 6){//3자리 이하
            for(int i = 0; i < array.length; i++){
                if(array[i].length() >= 3){
                    System.out.println("-1");
                    return;
                }
            }
        }

        List<String> str = new ArrayList<>(Arrays.asList(array));
        Collections.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1+o2).compareTo(o2+o1);
            }
        });

        str.forEach(s -> sb.append(s));
        Long smallNum = Long.parseLong(sb.toString());

        sb.setLength(0);
        for(int i = str.size()-1; i >= 0; i--){
            sb.append(str.get(i));
        }

        Long bigNum = Long.parseLong(sb.toString());

        Long answer = bigNum+smallNum;

        System.out.println(answer);
    }
}
