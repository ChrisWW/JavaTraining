package Pack1;
//  Zwierzeta maja rozne wlasciwosci, sa zwierzeta ktore potrafia latac, sa ktore potrafia plywac,
//  sa ktora potrafia zyc pod ziemia. Zdefinuj interfejsy dla kazdej wlasciwosci
//  np. interface FlyableAnimal{ void fly():} nastepnie wymysl konkretnego zwierzta ktory
//  implementuje dane wlasciwosci badz kilka wlasciwosci, mozesz tutaj wymyslec jakies zwierze ktore potrafi latac i plywac
//  np.  Nastepnie zdefinuj w obiekcie klienta (bedzie to zazwyczaj funkcja main() ) obiekty poszczegolnych typow.
//  np: FlyableAnimal animali przypisz do nich konkretne implementacje zwierza ktorych wymysliles i odwolaj sie
//  do metod tych wlasciwosci .


public class Exercise8 {

    public static void main(String[] args){

        Lion lion = new Lion("Lew");
        Bird bird = new Bird("Ptak");


        lion.run();

        bird.eat();
        bird.fly();
        bird.eat();
    }
}


interface FlyableAnimal {
    void fly();
}

interface SwimmingAnimal {
    void swim();
}

interface RunningAnimal {
    void run();
}

interface AllAnimal {
    void eat();
    void sleep();
}

class Bird implements FlyableAnimal, AllAnimal, SwimmingAnimal{
    String name;
    public Bird(String name) {
        this.name = name;
    }

    @Override
    public void fly() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void swim() {

    }
}

class Lion implements RunningAnimal {
    String name;
    public Lion(String name) {
        this.name = name;
    }

    @Override
    public void run() {

    }
}