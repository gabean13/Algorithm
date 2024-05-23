package solvedAcSprout.conditions;

import java.util.Scanner;

public class Pr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        //윤년이면 1 아니면 0
        if(year % 4 == 0){
            if(year % 100 != 0){
                System.out.println(1);
            }
            else if(year % 400 == 0){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }else{
            System.out.println(0);
        }


        sc.close();
    }
}
