package Pack1;

public class MegaBytesConverter {
    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(5230);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        double megaBytes = kiloBytes/1000;
        int megaBytesInt = kiloBytes/1000;
        int quantity = (int) (megaBytes % 1000);

        int kiloBytesQuantity = kiloBytes - quantity*1000;

        if (kiloBytes<0) {
            System.out.println("Invalid Value");
        }
        else {
        System.out.println(kiloBytes + " KB = " + megaBytesInt + " MB " + kiloBytesQuantity + " KB");
        }
    }
}
