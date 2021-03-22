package Pack2;

import java.util.Arrays;

//Wyswietla liste utworow alfabetycznie metoda tylko liste utworow alfabetycznie

public class MediaPlayerRefactor {

    CD plyta1 = new CD("Black Sabbath",
            Arrays.asList(
                    new Utwor("Paranoid", Arrays.asList("Tony Iommi", "Ozzy Ossbourne", "Geezer", "Bill Ward"), 5.4),
                    new Utwor("Hand of Doom", "Geezer", 3.4))
    );

    public void OdtworzNumer(int numerUtworu) {
        Utwor utwor = plyta1.listaUtworow.get(numerUtworu);

        System.out.println("Odtwarzasz numer " + numerUtworu + " o tytule " + utwor.tytulUtworu + " Wykonawcy " + utwor.getWykonawcy());
    }
}
