package softear;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class pr5 {

    static class Node{
        int x;
        int y;
        int cnt;

        public Node(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] str = input.split(" ");

        //입력이 올바르지 않은 경우
        //1. 2개가 아닌 경우
        //2. 숫자가 아닌경우

        if(str.length != 2){
            System.out.println("-1");
            return;
        }

        for(int i = 0; i < str.length; i++){
            if(!isNum(str[i])){
                System.out.println("-1");
                return;
            }
        }

        int yl = Integer.parseInt(str[0]);
        int xl = Integer.parseInt(str[1]);

        //3. 0인 경우
        if(yl <= 0 || xl <= 0){
            System.out.println("-1");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        boolean[][] visited = new boolean[yl][xl];

        //첫번째 위치
        queue.add(new Node(0,0,0));
        visited[0][0] = true;

        //이동 방향
        //dy dx : (-2, -1), (-2, 1) (-1, -2) (-1, 2)  / (1, -2) (2, -1) (2, 1) (1, 2)
        int[] dy = {-2, -2, -1, -1, 1,2,2, 1};
        int[] dx = {-1,1,-2,2,-2,-1,1,2};
        int count = 0;
        int total = 0;//방문 갯수 체크

        while(!queue.isEmpty()){
            total++;
            Node node = queue.remove();
            count = node.cnt;
            int cx = node.x;
            int cy = node.y;
            for(int i = 0; i < 8; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                //이동 가능하고
                if(0 <= nx && nx < xl && 0 <= ny && ny < yl){
                    //방문하지 않았고
                    if(!visited[ny][nx]){
                        Node newNode = new Node(nx, ny, node.cnt+1);
                        visited[ny][nx] = true;
                        queue.add(newNode);
                    }
                }
            }
        }

        String answer = (total == xl*yl) ? "T" : "F";

        System.out.println(answer + count);
    }

    public static boolean isNum(String str){
        try{
            Integer.parseInt(str);
        }catch (NumberFormatException e){
            return false;
        }return true;
    }

}
