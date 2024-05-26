package softear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class pr2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] array = input.split(" ");
        String answer;

        String secretKey = array[1];
        int rotate = Integer.parseInt(array[2]);
        String message = array[3];

        //비밀키 숫자로 변환
        int[] secretArr = new int[secretKey.length()];
        for(int i = 0; i < secretKey.length(); i++){
            secretArr[i]  = secretKey.charAt(i) - 'a';
        }
        System.out.println();
        //메세지 숫자로 변환
        int[] messageArr = new int[message.length()];
        for(int i = 0; i < message.length(); i++){
            messageArr[i] = message.charAt(i) - 'a';
        }

        while(rotate > secretArr.length){
            rotate -= secretArr.length;
        }

        //암호화 or 복호화
        if(array[0].equals("encrypt")){
            answer = encrypt(secretArr,rotate,messageArr);
        }else{
            answer = decrypt(secretArr,rotate,messageArr);
        }

        System.out.println(answer);
    }

    public static String encrypt(int[] secretArr, int rotateNum ,int[] messageArr){
        StringBuffer sb = new StringBuffer();
        int length = secretArr.length;
        int[] sumArr = new int[length];

        //1. 합 구하기
        for(int i = 0; i < length; i++){
            sumArr[i] = secretArr[i] + messageArr[i];
            while(sumArr[i] > 26) {
                sumArr[i] -= 26;
            }
        }

        int[] copyArr = new int[length];
        for(int i = 0; i < length; i++){
            copyArr[i] = sumArr[i];
        }
        //2. 로테이트 만큼 이동
        for(int i = 0; i < length; i++){
            int idx = i - rotateNum;
            if(idx < 0){
                idx = length - rotateNum + i;
            }
            if(idx >= length){
                idx -= length;
            }
            sumArr[idx] = copyArr[i];
        }

        for(int i = 0; i < length; i++){
            char ch = (char)(sumArr[i] += 'a');
            sb.append(ch);
        }

        return sb.toString();
    }
    public static String decrypt(int[] secretArr, int rotateNum ,int[] messageArr){
        return null;
    }
}
