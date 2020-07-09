package clean_code.baitap;


public class TennisGame {
    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;

    public static String getScore(int play1_Score, int play2_Score) {
        StringBuilder point = new StringBuilder();
        int tempPoint;
        if (play1_Score == play2_Score) {
            switch (play1_Score) {
                case LOVE:
                    point = new StringBuilder("Love-All");
                    break;
                case FIFTEEN:
                    point = new StringBuilder("Fifteen-All");
                    break;
                case THIRTY:
                    point = new StringBuilder("Thirty-All");
                    break;
                case FORTY:
                    point = new StringBuilder("Forty-All");
                    break;
                default:
                    point = new StringBuilder("Deuce");
                    break;

            }
        } else if (play1_Score >= 4 || play2_Score >= 4) {
            int minusResult = play1_Score - play2_Score;
            if (minusResult == 1) point = new StringBuilder("Advantage player1");
            else if (minusResult == -1) point = new StringBuilder("Advantage player2");
            else if (minusResult >= 2) point = new StringBuilder("Win for player1");
            else point = new StringBuilder("Win for player2");
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempPoint = play1_Score;
                else {
                    point.append("-");
                    tempPoint = play2_Score;
                }
                switch (tempPoint) {
                    case LOVE:
                        point.append("Love");
                        break;
                    case FIFTEEN:
                        point.append("Fifteen");
                        break;
                    case THIRTY:
                        point.append("Thirty");
                        break;
                    case FORTY:
                        point.append("Forty");
                        break;
                }
            }
        }
        return point.toString();
    }
}
