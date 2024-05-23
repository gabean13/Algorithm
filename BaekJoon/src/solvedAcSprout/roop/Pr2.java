package solvedAcSprout.roop;

import java.util.Scanner;

public class Pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int factorial = 1;

        for(int i = 1; i < N+1;i++){
            factorial *= i;
        }

        System.out.println(factorial);

        sc.close();
    }
}
