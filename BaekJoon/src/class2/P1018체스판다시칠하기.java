package class2;

import java.io.*;
import java.util.*;

public class P1018체스판다시칠하기 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        //1. 입력
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[][] board = new String[N][M];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(bf.readLine());
            String str = st.nextToken();
            String[] strArr = str.split("");
            for(int j = 0; j < M; j++){
                board[i][j] = strArr[j];
            }
        }

        //2. 계산
        int min = 64;
        for(int x = 0; x < N; x++){
            for(int y = 0; y < M; y++){
                if(x + 7 >= N || y + 7 >= M){
                    break;
                }
                //바꿔야하는 값 계산
                int cc = changeCnt(board, x, y);
                if(cc < min){
                    min = cc;
                }
            }
        }

        System.out.println(min);
    }

    public static int changeCnt (String[][] board, int x, int y){
        String[] black = {"B", "W"};
        String[] white = {"W", "B"};
        int blackCnt = 0;
        int whiteCnt = 0;
        int idx = 0;

        for(int i = x; i < x+8; i++){
            for(int j = y; j < y+8; j++){
                if(!board[i][j].equals(black[idx])){
                    blackCnt++;
                }
                if(!board[i][j].equals(white[idx])){
                    whiteCnt++;
                }
                idx = (idx==1) ? 0 : 1;
            }
            idx = (idx==1) ? 0 : 1;
        }

        return whiteCnt > blackCnt ? blackCnt : whiteCnt;
    }
}
