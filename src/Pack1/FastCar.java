package Pack1;


import java.io.IOException;

       class Car1 {
  public void brake() throws IOException {
           System.out.print("I will throw an exception!");
          }
 }
 class FastCar extends Car1 {
    @Override
    public void brake() {
              System.out.print("I will not throw an exception!");
         }
   public static void main(final String[] args) {
             final Car1 car = new FastCar();
               final FastCar fastCar = new FastCar();

               try {
             car.brake(); } catch (IOException e) {
                   e.printStackTrace();
               }
       fastCar.brake();
            }
 }

