package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int answer = 0;
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long [] sum = new long[N+1];

        st = new StringTokenizer(bf.readLine());
        for(int i = 1; i <= N; i++){
            sum[i] = Long.parseLong(st.nextToken()) + sum[i - 1];
        }

        for(int i = 1; i <= N; i++){
            int j = 0;
            while(j < i){
                if((sum[i] - sum[j]) % M == 0){
                    answer++;
                }
                j++;
            }
        }

        System.out.println(answer);
    }
}
