package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        double sum = 0, maxScore = 0;

        st = new StringTokenizer(bf.readLine());
        for(int i = 0;i < N;i++){
            double score = Double.parseDouble(st.nextToken());
            sum += score;
            if(score > maxScore){
                maxScore = score;
            }
        }

        System.out.println(sum / maxScore * 100 / N);

        bf.close();
    }
}
