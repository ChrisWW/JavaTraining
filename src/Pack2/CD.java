package Pack2;

import java.util.List;

public class CD {
    String nazwaAlbumu;
    List<Utwor> listaUtworow;

    public CD(String nazwaAlbumu, List<Utwor> listaUtworow) {
        this.nazwaAlbumu = nazwaAlbumu;
        this.listaUtworow = listaUtworow;

    }
}


class Utwor {
    String tytulUtworu;
    List<String> wykonawcyUtworu;
    String wykonawcaUtworu;
    double czasTrwania;

    public Utwor(String tytulUtworu, List<String> wykonawcyUtworu, double czasTrwania) {
        this.tytulUtworu = tytulUtworu;
        this.wykonawcyUtworu = wykonawcyUtworu;
        this.czasTrwania = czasTrwania;

    }

    public Utwor(String tytulUtworu, String wykonawcaUtworu, double czasTrwania) {
        this.tytulUtworu = tytulUtworu;
        this.wykonawcaUtworu = wykonawcaUtworu;
        this.czasTrwania = czasTrwania;

    }

    public String getWykonawcy() {
        if(wykonawcyUtworu == null) {
            return wykonawcaUtworu;
        }
        else {
            return String.join(", ", wykonawcyUtworu);
        }
    }
}