package class2;

import java.io.*;
import java.util.*;
public class P1436영화감독숌 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        long num = 665;


        while(count < N){
            num++;
            if(String.valueOf(num).contains("666")){
                count++;
            }
        }

        System.out.println(num);
    }
}
