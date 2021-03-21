package Pack1;// tablica // -> liczby parzytste
// if /2 output

public class ParzysteToArray {

    public static void main(String[] args) {
        int j = 0;
        int[] tablica = {0, 1, 2, 3, 4, 5 ,6, 7, 8, 9};
        int[] tablicaParzyste = new int[(tablica.length/2)+1];


        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] % 2 == 0) {

                tablicaParzyste[j] = tablica[i];

                System.out.println(tablicaParzyste[j]);

                j++;


            }


        }

    }
}
