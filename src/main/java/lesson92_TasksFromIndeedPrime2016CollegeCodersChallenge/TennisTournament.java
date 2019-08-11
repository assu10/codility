package lesson92_TasksFromIndeedPrime2016CollegeCodersChallenge;

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
