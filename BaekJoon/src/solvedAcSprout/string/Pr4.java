package solvedAcSprout.string;

import java.util.Scanner;

public class Pr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String value = sc.next();
        char frontScore = value.charAt(0);
        char secondScore = 0;

        if(value.length() == 1){
            secondScore = '0';
        }else{
            secondScore = value.charAt(1);
        }

        double scoreNum = 0;

        switch (frontScore){
            case 'A': {
                scoreNum += 4;
                break;
            }
            case 'B': {
                scoreNum += 3;
                break;
            }
            case 'C': {
                scoreNum += 2;
                break;
            }
            case 'D': {
                scoreNum += 1;
                break;
            }
            default: {

            }
        }

        switch (secondScore){
            case '+' :{
                scoreNum += 0.3;
                break;
            }
            case '-' :{
                scoreNum -= 0.3;
                break;
            }
            default: break;
        }

        System.out.println(scoreNum);

        sc.close();
    }
}
