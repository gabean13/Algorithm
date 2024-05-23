package solvedAcSprout.string;

import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String value = sc.next();
        char[] array = new char[value.length()];

        for(int i = 0; i < value.length(); i++){
            char ch = value.charAt(i);
            if(ch >= 'a'){
                array[i] = (char)('A' + ch - 'a');
            }else{
                array[i] = (char)('a' + ch - 'A');
            }
            System.out.print(array[i]);
        }

        sc.close();
    }
}
