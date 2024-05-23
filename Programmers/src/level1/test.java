package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String[] array = {"hello", "bye", "hee"};
        int n = 1;

        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(n) - o2.charAt(n);
            }
        }.thenComparing((o1, o2) -> o1.compareTo(o2)));

        for (String s : array) {
            System.out.println("s = " + s);
        }
    }
}
