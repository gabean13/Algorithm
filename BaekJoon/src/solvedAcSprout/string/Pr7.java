package solvedAcSprout.string;

import java.io.*;

public class Pr7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();

        int T = Integer.parseInt(line);

        for(int i = 0; i < T;i++){
             line = bf.readLine();
             char first = line.charAt(0);
             char last = line.charAt(line.length()-1);
            System.out.print(first);
            System.out.println(last);
        }

        bf.close();

    }
}
