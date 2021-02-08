package Pack1;
//7. Zdefinuj klase ktora nazywa sie ReverseAdvancedCalculator ktora wykonuje
// metody mnozace, dzielace, dodajace, udejmujace w odwrotny sposob czyli : dodawanie bedzie odejmowac, mnozenie bedzie dzielic itd.
public class Exercise7 {

    public static void main(String[] args) {

        ReverseAdvancedCalculator reverseAdvancedCalculator = new ReverseAdvancedCalculator(5, 10);

        System.out.println();
        reverseAdvancedCalculator.reverseDivideMethod();
        System.out.println();
        System.out.println();
        reverseAdvancedCalculator.reverseMinusMethod();
        System.out.println();
        System.out.println();
        reverseAdvancedCalculator.reverseMultiplyMethod();
        System.out.println();
        System.out.println();
        reverseAdvancedCalculator.reverseSumMethod();
    }
}



class ReverseAdvancedCalculator {
    float number1;
    float number2;

    public ReverseAdvancedCalculator(float number1, float number2) {

        this.number1 = number1;
        this.number2 = number2;

    }

    void reverseSumMethod() {
        float number;
        number = number1 - number2;
        System.out.println("Result of reverseSum is " + number);
    }

    void reverseMinusMethod() {
        float number;
        number = number1 + number2;
        System.out.println("Result of reverseMinus is " + number);
    }

    void reverseDivideMethod() {
        double number;
        number = number1 * number2;
        System.out.println("Result of reverseDivide is " + number);
    }

    void reverseMultiplyMethod() {
        float number;
        number = number1 / number2;
        System.out.println("Result of reverseMultiply is " + number);
    }
}