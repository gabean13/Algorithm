package solvedAcSprout.string;

import java.io.*;

public class Pr6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;

        while((line = bf.readLine()) != null){
            bw.write(line + "\n");
        }

        bw.flush();
        bf.close();
        bw.close();
    }
}