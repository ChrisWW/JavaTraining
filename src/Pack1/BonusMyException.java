package Pack1;
//Zaprojektuj swoje podniesienie wyjatku w formie klasy
public class BonusMyException {

    public static void main(String[] args){

        try {
        fun();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
    public static void fun() throws MyException {
            try {
                throw new MyException("Opis bledu");
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
    }



class MyException extends Exception {

    String info;

    public MyException(String info) {
        super(info);
    }


}
