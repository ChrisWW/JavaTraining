package Pack2;

import java.util.Arrays;
import java.util.List;

public class WorkMedia {
    public static void main(String[] args) {
        MediaPLayer mediaPLayer = new MediaPLayer("Black Sabbath", "Paranoid",
                Arrays.asList(new String[]{"Paranoid", "War Pigs", "Iron Man", "Rat Salad"}));

        MediaPLayer mediaPLayer2 = new MediaPLayer("The Police", "Reggatta de Blanc",
                Arrays.asList(new String[]{"Message in a Bottle", "Walking on the Moon ", "Iron Man", "Contact"}));

        MediaPLayer mediaPLayer3 = new MediaPLayer("Jazz Band Młynarski-Masecki", "Płyta z zadrą w sercu",
                Arrays.asList(new String[]{"Yo Yo", "Plyta z zazdra w sercu", "Abram ja Ci zagram", "Dla ciebie"}));

        // Test

        mediaPLayer.WyszukajUtwor("Paranoid");
        System.out.println();

        mediaPLayer3.OdtwarzajJednoczesnie("Yo Yo", "Plyta z zazdra w sercu");
        System.out.println();

        mediaPLayer2.WyszukajUtwor("Message in a Bottle");
        System.out.println();

        mediaPLayer2.WyszukajUtwor("Black sabbath");
        System.out.println();
    }
}


class MediaPLayer {
    String artysta;
    String nazwaAlbumu;
    List<String> utwory;


    public MediaPLayer(String artysta, String nazwaAlbumu, List<String> utwory) {
        this.artysta = artysta;
        this.nazwaAlbumu = nazwaAlbumu;
        this.utwory = utwory;
    }

    protected void WyszukajArtysta(String artysta1) {

        if (artysta1 == artysta) {
            System.out.println("Wybierasz artyste " + artysta1 + " Milego Sluchania");
        }
        else {
            System.out.println("Nie znaleziono artysty " + artysta1);
        }
    }

    protected void WyszukajnazwaAlbumu(String nazwaAlbumu1) {
        if (nazwaAlbumu1 == nazwaAlbumu) {
            System.out.println("Wybierasz album " + nazwaAlbumu1 + " Milego Sluchania");
        }
        else {
            System.out.println("Nie znaleziono albumu " + nazwaAlbumu1);
        }
    }

    protected void WyszukajUtwor(String utwory1) {
        boolean temp = utwory.contains(utwory1) ? true : false;

        if(temp) {
            System.out.println("Wybierasz utwor " + utwory1 + " swietny wybór!");
        }
        else {
            System.out.println("Niestety nie udalo sie znalezc utworu na tej plycie");
        }

        }



    protected void OdtwarzajPojedynczo(String utwory1) {
        boolean temp = utwory.contains(utwory1) ? true : false;

        if(temp) {
            System.out.println("Odtwarzasz utwor " + utwory1 + " swietny wybór!");
        }
        else {
            System.out.println("Niestety nie udalo sie znalezc utworu na tej plycie");
        }

    }

    protected void OdtwarzajJednoczesnie(String utwory1, String utwory2) {
        boolean temp = utwory.contains(utwory1) ? true : false;
        boolean temp2 = utwory.contains(utwory2) ? true : false;

        if(temp && temp2) {
            System.out.println("Odtwarzasz 2 utwory jednoczesnie " + utwory1 + " oraz " + utwory2);
        }
        else {
            System.out.println("Nie posiadamy takich utworow, sprobuj wpisac ponownie");
        }
    }

    protected void OdtwarzajJednoczesnie(String utwory1, String utwory2, String utwory3) {
        boolean temp = utwory.contains(utwory1) ? true : false;
        boolean temp2 = utwory.contains(utwory2) ? true : false;
        boolean temp3 = utwory.contains(utwory3) ? true : false;

        if(temp && temp2 && temp3) {
            System.out.println("Odtwarzasz 2 utwory jednoczesnie " + utwory1 + ", " + utwory2 + ", " + utwory3);
        }
        else {
            System.out.println("Nie posiadamy takich utworow, sprobuj wpisac ponownie");
        }
    }

    protected void OdtwarzajJednoczesnie(String utwory1, String utwory2, String utwory3, String utwory4) {
        boolean temp = utwory.contains(utwory1) ? true : false;
        boolean temp2 = utwory.contains(utwory2) ? true : false;
        boolean temp3 = utwory.contains(utwory3) ? true : false;
        boolean temp4 = utwory.contains(utwory4) ? true : false;

        if(temp && temp2 && temp3 && temp4) {
            System.out.println("Odtwarzasz 2 utwory jednoczesnie " + utwory1 + ", " + utwory2 + ", " + utwory3 + ", "+ utwory4);
        }

        else {
            System.out.println("Nie posiadamy takich utworow, sprobuj wpisac ponownie");
        }


    }
}
