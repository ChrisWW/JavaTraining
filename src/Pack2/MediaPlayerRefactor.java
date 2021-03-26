package Pack2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//Wyswietla liste utworow alfabetycznie metoda tylko liste utworow alfabetycznie

public class MediaPlayerRefactor {

    CD plyta1 = new CD("Black Sabbath",
            Arrays.asList(
                    new Utwor("Paranoid", Arrays.asList("Tony Iommi", "Ozzy Ossbourne", "Geezer", "Bill Ward"), 5.4),
                    new Utwor("Hand of Doom", "Geezer", 3.4),
                    new Utwor("1Hand of Doom", "Geezer", 3.2))
    );

    public void OdtworzNumer(int numerUtworu) {
        Utwor utwor = plyta1.listaUtworow.get(numerUtworu);

        System.out.println("Odtwarzasz numer " + numerUtworu + " o tytule " + utwor.tytulUtworu + " Wykonawcy " + utwor.getWykonawcy());
    }

    public void OdtworzAlfabetycznie(String nazwaAlbumu) {
        if(plyta1.nazwaAlbumu == nazwaAlbumu) {
            Collections.sort(plyta1.listaUtworow, new Comparator<Utwor>() {
                @Override
                public int compare(Utwor o1, Utwor o2) {
                    return o1.tytulUtworu.compareToIgnoreCase(o2.tytulUtworu);
                }
            });
            for(int i =0; i<plyta1.listaUtworow.size();i++)
            System.out.println(plyta1.listaUtworow.get(i).tytulUtworu);
            } else {
            System.out.println("Wpisany zostal zly adres");
        }

        }

    }

