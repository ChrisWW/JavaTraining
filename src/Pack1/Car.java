package Pack1;
//1. Znajdz w swiecie rzeczywistym obiekt ktory ma rozne stany
// oraz zachowania i odwzoruj go piszac klase reprezentujaca dany obiekt.


class Car {
    String company;
    String name;
    String gearbox;
    int wheelsQuantity;
    int maxSpeed;
    String additional;


    private Car(String company, String name, String gearbox, int wheelsQuantity, int maxSpeed, String additional) {

        this.company = company;
        this.name = name;
        this.gearbox = gearbox;
        this.wheelsQuantity = wheelsQuantity;
        this.maxSpeed = maxSpeed;
        this.additional = additional;

    }

    void toot() {
        System.out.println("Car makes a noise.. toot;)");
    }

    void inceasingSpeed(int speed, int increment) {

        for(int i = 0; i < maxSpeed; i++) {
        speed =+ increment;
        }
        System.out.println("This is your maximum speed");
    }

    void decreasingSpeed(int speed, int decrement) {

        if (speed > 0) {
            for (int i = 0; i < speed; i++)
                speed -= decrement;
        }
        else {
            System.out.println("Your speed is 0");
        }
    }

}
