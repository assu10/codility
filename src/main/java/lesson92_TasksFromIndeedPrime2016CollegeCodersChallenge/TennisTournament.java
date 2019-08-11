package lesson92_TasksFromIndeedPrime2016CollegeCodersChallenge;

/**
 * 이번 경기의 첫 라운드를 참가할 P 플레이어는 이미 등록되어 있고, 당신은 C 코트를 예약했다.
 * 정확히는 각 게임에서 두 선수가 경기하고 각 코트에서는 한 번에 한 경기만 가능.
 * 동시에 시작 가능한 게임의 최대수를 구하고자 함.
 *
 * 선수 수 P, 예약된 코트수는 C일 때 동시에 진행 가능한 게임의 수 리턴
 *
 * P=5, C=3 이면 2리턴
 * P=10, C=3 이면 3리턴
 *
 * P, C는 1~30,000
 *
 * 22mins, 100%
 *
 * @author 이주현
 * @since 2019.18.11
 */
public class TennisTournament {
    public static void main(String[] args) {
        int P = 5;
        int C = 3;
        System.out.println(solution(P, C));
    }
    public static int solution(int P, int C) {
        // write your code in Java SE 8
        int games = 0;
        for (int i=1; i<=C; i++) {
            if ((i*2) <= P) {
                games++;
            }
        }
        return games;
    }
}
