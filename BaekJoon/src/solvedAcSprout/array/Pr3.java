package solvedAcSprout.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> submitStudents = new ArrayList<>();
        List<Integer> students = new ArrayList<>();

        for(int i = 0; i < 30; i++){
            students.add(i + 1);
        }

        for(int i = 0; i < 28;i++){
            submitStudents.add(sc.nextInt());
        }

        students.removeAll(submitStudents);
        System.out.println(students.get(0));
        System.out.println(students.get(1));

        sc.close();
    }
}
