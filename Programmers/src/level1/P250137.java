package level1;

public class P250137 {

    public static void main(String[] args) {
        int[] bondage = {5, 1, 5};
        int health = 30;
        int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};

        int solution = solution(bondage, health, attacks);

        System.out.println(solution);

    }
    public static int solution(int[] bandage, int health, int[][] attacks) {
        int time, bandageTime =0;
        int maxHealth = health;
        int attackTime = 0;

        for(time = 1; time <= attacks[attacks.length - 1][0]; time++){
            if(time == attacks[attackTime][0]){
                health -= attacks[attackTime][1];
                attackTime++;
                bandageTime = 0;
                continue;
            }
            if(health <= 0){
                return -1;
            }

            health += bandage[1];
            bandageTime++;
            if(bandageTime == bandage[0]){
                health = health + bandage[2];
                bandageTime = 0;
            }
            if(health >= maxHealth){
                health = maxHealth;
            }
        }

        return (health <= 0) ? -1 : health;
    }
}
