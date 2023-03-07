public class MokkiTikka extends Game {

    int[] scores;
    boolean loppu = false;

    public MokkiTikka() {
    }

    @Override
    void initializeGame() {
        scores = new int[5];
    }

    @Override
    void makePlay(int player) {
        int rand = 0;
        int j = 0;
        int score = 0;
        int maxScore = 10;
        int minScore = 0;
        int range = maxScore - minScore + 1;
        while (j < 1) {
            for (int i = 0; i < 1; i++) {
                rand = (int) (Math.random() * range) + minScore;
                System.out.println("Tikan heitto numero " + j + " : " + rand);
            }
            score += rand;
            j++;
        }
        System.out.println("Pelaaja vaihtuu");
        scores[player] = score;
    }

    @Override
    boolean endOfGame() {
       return false;
    }


    @Override
    void printWinner() {
        int winner = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > scores[winner]) winner = i;
        }
        int winnerNum = winner + 1;
        System.out.println("Pelaaja numero " + winnerNum + " voitti! Pisteet: " + scores[winner]);
    }
}
