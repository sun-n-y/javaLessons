public class SecondsAndMinuteChallenge {

    public static void main(String[] args) {

        System.out.println(getDurationString(-3900));
        System.out.println(getDurationString(-65,45));
        System.out.println(getDurationString(65,145));
    }

    public static String getDurationString(int seconds){

        if(!(seconds > -1)){
             return "invalid value";
        }

        int minutes = seconds/60;

        return getDurationString(minutes,60);
    }

    public static String getDurationString(int minutes, int seconds){

        if(!(minutes > -1)){
            return "invalid value";
        }

        if(!(seconds>-1 && seconds<60)){
            return "invalid value";
        }

        int hours = minutes/60;
        int remainingMinutes = minutes%60;
        int remainingSeconds = remainingMinutes % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }
}
