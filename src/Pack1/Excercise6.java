package Pack1;
//6. Zdefinuj interfejs Animal a nastepnie stworz kilka podklas interfejsu Animal
public class Excercise6 {

    public static void main(String[] args) {


        Animal dog = new Dog();
        Animal tiger = new Tiger();

        function(dog);
        function(tiger);
    }

    static void function(Animal animal) {
        animal.eat();
        System.out.println();
        animal.animalSound();
    }
}

interface Animal {

    public void animalSound();

    public void eat();
}

class Tiger implements Animal {

    @Override
    public void animalSound() {
        String noise = "Arrrggg";
        System.out.println(noise);

    }


    @Override
    public void eat() {

        System.out.println("Rozrywa ofiare, pozniej zjada jej wnetrzosci");
    }
}

class Dog implements Animal {

    @Override
    public void animalSound() {
        String noise = "Whoof";
        System.out.println(noise);
    }

    @Override
    public void eat() {

        System.out.println("Pies przegryza karme");
    }
}