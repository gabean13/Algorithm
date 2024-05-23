package solvedAcSprout.string;

import java.util.Scanner;

public class Pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()){
            System.out.println(sc.nextInt() + 48);
        }else{
            int ascii = sc.next().charAt(0);
            System.out.println(ascii);
        }

        sc.close();
    }
}
