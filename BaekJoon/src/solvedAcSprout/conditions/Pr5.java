package solvedAcSprout.conditions;

import java.util.Scanner;

public class Pr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long M = sc.nextLong();
        Long sub = N - M;

        System.out.println(Math.abs(sub));
    }
}
