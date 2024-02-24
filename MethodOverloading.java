public class MethodOverloading {

    public static void main(String[] args) {

        System.out.println("new score is " + calculateScore("tim", 500));
        System.out.println("new score is " + calculateScore(500));
        System.out.println("new score is " + calculateScore());
    }

    public static int calculateScore(String playerName, int score){

        System.out.println("Player " + playerName + " scored " + score + " points" );
        return score * 1000;
    }

    public static int calculateScore(int score){

        return  calculateScore("Anonymous", score);
    }

    public static int calculateScore(){

        System.out.println("No player name, no player score");
        return 0;
    }
}
