package clean_code.baitap;


public class TennisGame {
    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;

    public static String getScore(int play1_Score, int play2_Score) {
        StringBuilder score = new StringBuilder();
        int tempScore;
        if (play1_Score == play2_Score) {
            switch (play1_Score) {
                case LOVE:
                    score = new StringBuilder("Love-All");
                    break;
                case FIFTEEN:
                    score = new StringBuilder("Fifteen-All");
                    break;
                case THIRTY:
                    score = new StringBuilder("Thirty-All");
                    break;
                case FORTY:
                    score = new StringBuilder("Forty-All");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;

            }
        } else if (play1_Score >= 4 || play2_Score >= 4) {
            int minusResult = play1_Score - play2_Score;
            if (minusResult == 1) score = new StringBuilder("Advantage player1");
            else if (minusResult == -1) score = new StringBuilder("Advantage player2");
            else if (minusResult >= 2) score = new StringBuilder("Win for player1");
            else score = new StringBuilder("Win for player2");
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = play1_Score;
                else {
                    score.append("-");
                    tempScore = play2_Score;
                }
                switch (tempScore) {
                    case LOVE:
                        score.append("Love");
                        break;
                    case FIFTEEN:
                        score.append("Fifteen");
                        break;
                    case THIRTY:
                        score.append("Thirty");
                        break;
                    case FORTY:
                        score.append("Forty");
                        break;
                }
            }
        }
        return score.toString();
    }
}
