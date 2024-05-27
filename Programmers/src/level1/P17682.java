package level1;

public class P17682 {
    public int solution(String dartResult) {
        int answer = 0;
        String[] arr = dartResult.split("");
        int[] scores = new int[3];

        int idx = 0;
        int scoreIdx = 0;
        for(int i = 0; i < 3; i++){
            //1. 값들을 알맞게 할당한다
            //1-1.score
            int score = Integer.parseInt(arr[idx]);
            if(arr[idx+1].equals("0")){
                score = 10;
                idx++;
            }
            idx++;
            //1-2. bonus
            int bonus = 0;
            switch (arr[idx]){
                case("S") :
                    bonus = 1;
                    break;
                case("D") :
                    bonus = 2;
                    break;
                case("T") :
                    bonus = 3;
                    break;
            }
            idx++;

            //1-3. option
            String option = null;
            if(idx < dartResult.length() && (arr[idx].equals("*") || arr[idx].equals("#"))){
                option = arr[idx++];
            }

            //2. 점수 계산
            if( option == null ){
                scores[scoreIdx] = (int)Math.pow(score, bonus);
            }else if(option.equals("*")){
                if(scoreIdx != 0){
                    scores[scoreIdx-1] *= 2;
                }
                scores[scoreIdx] = (int)Math.pow(score, bonus) * 2;
            }else{
                scores[scoreIdx] = (int)Math.pow(score, bonus) * -1;
            }
            scoreIdx++;

            for(int k = 0; k < scores.length; k++){
                System.out.print(scores[k] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < scores.length; i++){
            answer += scores[i];
        }

        return answer;
    }
}
