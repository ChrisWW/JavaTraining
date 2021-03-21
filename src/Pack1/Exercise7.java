package Pack1;
//7. Zdefinuj klase ktora nazywa sie ReverseAdvancedCalculator ktora wykonuje
// metody mnozace, dzielace, dodajace, udejmujace w odwrotny sposob czyli : dodawanie bedzie odejmowac, mnozenie bedzie dzielic itd.
public class Exercise7 {

    public static void main(String[] args) {


    }
}



class ReverseAdvancedCalculator extends Calculator {

    @Override
    int sum(int number1, int number2) {
        System.out.println("This is number overrided in ReverseADvancedfunction: ");
        return super.sum(number1, number2);
    }

    @Override
    void display() {

    }
}