public class ChallengeMethodOverload {

    public static void main(String[] args) {

        System.out.println("5ft - 8in to cm is " + convertToCentimeters(5,8));

    }

    public static double convertToCentimeters(int p1){
        return p1 * 2.54;
    }

    public static double convertToCentimeters(int p1, int p2){
        return convertToCentimeters((p1*12)+p2);
    }

}
