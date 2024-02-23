public class ChallengeTwo {

    public static void main(String[] args) {

        displayHighScorePosition("sunny", calculateHighScore(1500));
        displayHighScorePosition("timmy", calculateHighScore(1000));
        displayHighScorePosition("jimmy", calculateHighScore(500));
        displayHighScorePosition("himmy", calculateHighScore(100));
        displayHighScorePosition("zimmy", calculateHighScore(25));

    }

    public static void displayHighScorePosition(String playersName, int playerPosition) {
        System.out.println(playersName + " managed to get into position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScore(int playersScore) {

        int position = 4;
        if (playersScore >= 1000) {
            position = 1;
        } else if (playersScore >= 500) {
            position = 2;
        } else if (playersScore >= 100) {
            position = 3;
        }
        return position;

    }
}
