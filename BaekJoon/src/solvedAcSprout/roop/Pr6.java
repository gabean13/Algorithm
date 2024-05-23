package solvedAcSprout.roop;

import java.util.Scanner;

public class Pr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i < N + 1;i++){
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        sc.close();
    }
}
