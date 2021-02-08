package Pack1;
//3. Napisz klase ktora przyjmuje w konstrzuktorze dwa argumenty typu Int i przypisuje je do zmiennej wewnatrz tej klasy
// oraz 2 funkcje ktora zwracaja wynik dodawania tych dwoch zmiennych, wynik mnozenia oraz funkcje ktora zwraca
// String w formie "Your first number is (tutaj wartosc pierwszej liczby), your second number is (tutaj wartosc drugiej liczby).

//4. Zdefinuj klase ktora nazywa sie SimpleCalculator i posiada metody dodajace dwie liczb oraz, odejmujace dwie liczby.

//5. Zdefinuje klase ktora nazywa sie AdvancedCalculator ktora posiada metody SimpleCalculator i dodatkowo implementuje metody mnozace dwie liczby i dzielace.
public class Excercise345 {

    public static void main(String[] args) {
        Integers integers = new Integers(3, 4);

        integers.mathFunction();
        System.out.println();
        System.out.println("Other function");

        //Using SimpleCalculator

        SimpleCalculator simpleCalculator = new SimpleCalculator(5, 6);

        simpleCalculator.mathFunction();
        System.out.println();
        System.out.println("Other function");

        AdvancedCalculator advancedCalculator = new AdvancedCalculator(240,5);

        advancedCalculator.divide();
    }
}


class Integers {
    int number1;
    int number2;
    public Integers(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    void mathFunction() {
        int numberSum;
        int numberMultiply;
        int numberMinus;

       numberSum = number1 + number2;
       numberMinus = number1 - number2;
       numberMultiply = number1*number2;

       System.out.println("Your first number is " + number1 + " Your second number is "+ number2);
        System.out.println("Sum of numbers is " + numberSum + " Multiply of numbers is " + numberMultiply + " Minus of numbers is " + numberMinus);

    }


}

class SimpleCalculator extends Integers {

    public SimpleCalculator(int number1, int number2){
        super(number1, number2);


    }

}


class AdvancedCalculator extends SimpleCalculator {

    public AdvancedCalculator(int number1, int number2) {
        super(number1, number2);
    }

    //divide
    int divide() {
        int number;
        number = number1/number2;
        System.out.println("Your result of dividing numbers is " + number);
        return number;
    }
}