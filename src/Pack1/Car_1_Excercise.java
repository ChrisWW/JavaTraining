package Pack1;
//1. Znajdz w swiecie rzeczywistym obiekt ktory ma rozne stany
// oraz zachowania i odwzoruj go piszac klase reprezentujaca dany obiekt.

class Car_1_Excercise {

    public static void main(String[] args) {

        Car car1 = new Car("Audi", "A3", "Strong", 4, 280, "Very goode fo young people");
        Car car2 = new Car("Toyota", "Avensis", "Strong", 4, 230, "Cheap");

        car1.inceasingSpeed(30, 2);
        System.out.println("");

        car2.toot();

    }


}


class Car {
    String company;
    String model;
    String gearbox;
    int wheelsQuantity;
    int maxSpeed;
    String additional;


    Car(String company, String model, String gearbox, int wheelsQuantity, int maxSpeed, String additional) {

        this.company = company;
        this.model = model;
        this.gearbox = gearbox;
        this.wheelsQuantity = wheelsQuantity;
        this.maxSpeed = maxSpeed;
        this.additional = additional;

    }

    void toot() {
        System.out.println("Car "+ company + " "+ model + " makes a noise.. toot;)");
    }

    void inceasingSpeed(int speed, int increment) {

        for(int i = 0; i < maxSpeed; i++) {
        speed += increment;
        if(speed == maxSpeed){
            break;
            }
        }
        System.out.println("Your speed was increased to " + speed );
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
