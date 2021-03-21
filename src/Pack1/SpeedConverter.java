package Pack1;

public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(10.5);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        else {
            long milesPerHour = (long) (0.62150403*kilometersPerHour);
            return Math.round(milesPerHour);
        }
    }
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        else {
            double milesPerHour = Math.round((0.62150403*kilometersPerHour));
            System.out.println(kilometersPerHour + " km/h "+ milesPerHour + " miles/h ");

        }
    }
}
