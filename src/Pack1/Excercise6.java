package Pack1;
//6. Zdefinuj interfejs Animal a nastepnie stworz kilka podklas interfejsu Animal
public class Excercise6 {

    public static void main(String[] args) {


    }
}

interface Animal {

    public void animalSound(String noise);
    public void run();
    public void eat();
}

class Tiger implements Animal {

    @Override
    public void animalSound(String noise) {
        noise = "Arrrggg";
        System.out.println(noise);

    }

    @Override
    public void run() {

    }

    @Override
    public void eat() {

    }
}