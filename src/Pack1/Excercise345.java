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




        ///popra

        System.out.println(integers.multiplyFunction());

        // Simple

//        SimpleCalculator simpleCalculator = new SimpleCalculator();
//
//        System.out.println(simpleCalculator.sumSimpleCalculator(4, 3));
//        int result = simpleCalculator.minusSimpleCalculator(5,4);
//        System.out.println(result);

        // Advanced
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();

        int result2  = advancedCalculator.sum(5, 2);

        Calculator calculator2 = new AdvancedCalculator();



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

    int sumFunction() {

        return number1 + number2;
    }

    int minusFunction() {

        return number1 - number2;
    }

    int multiplyFunction() {

        return number1 * number2;
    }

    String numberString() {

        return "Your first number is " + number1 + " Your second number is " + number2;
    }

}

abstract class Calculator {

    int sum(int number1, int number2) {


        return number1 + number2;
    }

    int minus(int number1, int number2) {

        return number1 - number2;
    }

    abstract void display();
}




class AdvancedCalculator extends Calculator {

    int multiply(int number1, int number2) {
        return number1*number2;
    }

    int divide(int number1, int number2) {
        return number1/number2;
    }

    @Override
    void display() {

    }
}

abstract class Test {

    abstract void test();
}