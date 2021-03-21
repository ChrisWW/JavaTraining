package Pack1;

public class BarkingDog {


    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {


        if ((isBarking == true && (hourOfDay >= 0 && hourOfDay < 8)) || (isBarking == true && hourOfDay== 23)) {

            return true;
        }
        return false;
    }
}
