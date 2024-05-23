package level1;

import java.util.*;

public class P250121 {
    public static void main(String[] args) {
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        System.out.println(solution(data, "maximum", 800, "maximum"));

    }

    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);

        for(int[] arr : data){
            if(arr[map.get(ext)] <= val_ext){
                list.add(arr);
            }
        }

        list.sort(Comparator.comparingInt(arr -> arr[map.get(sort_by)]));

        return list.toArray(new int[list.size()][]);
    }
}


