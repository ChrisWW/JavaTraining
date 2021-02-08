package Pack1;
//3. Napisz klase ktora przyjmuje w konstrzuktorze dwa argumenty typu Int i przypisuje je do zmiennej wewnatrz tej klasy
// oraz 2 funkcje ktora zwracaja wynik dodawania tych dwoch zmiennych, wynik mnozenia oraz funkcje ktora zwraca
// String w formie "Your first number is (tutaj wartosc pierwszej liczby), your second number is (tutaj wartosc drugiej liczby).
public class Excercise3 {

    public static void main(String[] args) {
        Integers integers = new Integers(3, 4);

        integers.mathFunction();

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

       numberSum = number1 + number2;
       numberMultiply = number1*number2;

       System.out.println("Your first number is " + number1 + " Your second number is "+ number2);
        System.out.println("Sum of numbers is " + numberSum + " Multiply of numbers is " + numberMultiply);

    }


}