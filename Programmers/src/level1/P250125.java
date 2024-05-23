package level1;

public class P250125 {
    public static void main(String[] args) {
        String[][] board = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
        int h = 3;
        int w = 3;

        int solution = solution(board, h, w);
        System.out.println(solution);
    }

    public static int solution(String[][] board, int h, int w) {
        int sameBoardNum = 0;
        String boardColor = board[h][w];

        sameBoardNum += countSameColor(board, boardColor, h, w - 1);
        sameBoardNum += countSameColor(board, boardColor, h, w + 1);
        sameBoardNum += countSameColor(board, boardColor, h - 1, w);
        sameBoardNum += countSameColor(board, boardColor, h + 1, w);

        return sameBoardNum;
    }
    public static int countSameColor(String[][] board,String boardColor ,int h, int w){

        if(isExistBoard(h, w, board.length)){
            if(boardColor.equals(board[h][w])){
                return 1;
            }
        }

        return 0;
    }

    public static boolean isExistBoard(int h, int w, int maxN){
        return !((h < 0 || w < 0) || (h >= maxN || w >= maxN));
    }
}
