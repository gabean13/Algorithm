package solvedAcSprout.string;

import java.util.Scanner;

public class Pr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String value = sc.next();
        int i = sc.nextInt();

        System.out.println(value.charAt(i-1));

        sc.close();
    }
}
