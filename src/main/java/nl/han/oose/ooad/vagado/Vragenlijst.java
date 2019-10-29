package nl.han.oose.ooad.vagado;

import nl.han.oose.ooad.vagado.vraag.Antwoord;
import nl.han.oose.ooad.vagado.vraag.Keuzemogelijkheid;
import nl.han.oose.ooad.vagado.vraag.MeerkeuzeVraag;
import nl.han.oose.ooad.vagado.vraag.Vraag;

import javax.lang.model.type.ArrayType;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Vragenlijst {

    private int nummer;
    private String naam;
    private Thema thema;
    private List<Vraag> vragen;
    private int lifetimeBest;

    Vraag vraag1 = new MeerkeuzeVraag(1, "Hoevaak heeft het Nederlands Elftal de wereldbeker gewonnen?", new Keuzemogelijkheid[] {new Keuzemogelijkheid("A", "1"), new Keuzemogelijkheid("B", "2"), new Keuzemogelijkheid("C", "3"), new Keuzemogelijkheid("D", "0")}, new Antwoord("B"));
    Vraag vraag2 = new MeerkeuzeVraag(1, "Hoevaak heeft het Nederlands Elftal de wereldbeker gewonnen?", new Keuzemogelijkheid[] {new Keuzemogelijkheid("A", "1"), new Keuzemogelijkheid("B", "2"), new Keuzemogelijkheid("C", "3"), new Keuzemogelijkheid("D", "0")}, new Antwoord("B"));
    Vraag vraag3 = new MeerkeuzeVraag(1, "Hoevaak heeft het Nederlands Elftal de wereldbeker gewonnen?", new Keuzemogelijkheid[] {new Keuzemogelijkheid("A", "1"), new Keuzemogelijkheid("B", "2"), new Keuzemogelijkheid("C", "3"), new Keuzemogelijkheid("D", "0")}, new Antwoord("B"));
    Vraag vraag4 = new MeerkeuzeVraag(1, "Hoevaak heeft het Nederlands Elftal de wereldbeker gewonnen?", new Keuzemogelijkheid[] {new Keuzemogelijkheid("A", "1"), new Keuzemogelijkheid("B", "2"), new Keuzemogelijkheid("C", "3"), new Keuzemogelijkheid("D", "0")}, new Antwoord("B"));
    Vraag vraag5 = new MeerkeuzeVraag(1, "Hoevaak heeft het Nederlands Elftal de wereldbeker gewonnen?", new Keuzemogelijkheid[] {new Keuzemogelijkheid("A", "1"), new Keuzemogelijkheid("B", "2"), new Keuzemogelijkheid("C", "3"), new Keuzemogelijkheid("D", "0")}, new Antwoord("B"));
    Vraag vraag6 = new MeerkeuzeVraag(1, "Hoevaak heeft het Nederlands Elftal de wereldbeker gewonnen?", new Keuzemogelijkheid[] {new Keuzemogelijkheid("A", "1"), new Keuzemogelijkheid("B", "2"), new Keuzemogelijkheid("C", "3"), new Keuzemogelijkheid("D", "0")}, new Antwoord("B"));
    Vraag vraag7 = new MeerkeuzeVraag(1, "Hoevaak heeft het Nederlands Elftal de wereldbeker gewonnen?", new Keuzemogelijkheid[] {new Keuzemogelijkheid("A", "1"), new Keuzemogelijkheid("B", "2"), new Keuzemogelijkheid("C", "3"), new Keuzemogelijkheid("D", "0")}, new Antwoord("B"));
    Vraag vraag8 = new MeerkeuzeVraag(1, "Hoevaak heeft het Nederlands Elftal de wereldbeker gewonnen?", new Keuzemogelijkheid[] {new Keuzemogelijkheid("A", "1"), new Keuzemogelijkheid("B", "2"), new Keuzemogelijkheid("C", "3"), new Keuzemogelijkheid("D", "0")}, new Antwoord("B"));
    Vraag vraag9 = new MeerkeuzeVraag(1, "Hoevaak heeft het Nederlands Elftal de wereldbeker gewonnen?", new Keuzemogelijkheid[] {new Keuzemogelijkheid("A", "1"), new Keuzemogelijkheid("B", "2"), new Keuzemogelijkheid("C", "3"), new Keuzemogelijkheid("D", "0")}, new Antwoord("B"));
    Vraag vraag10 = new MeerkeuzeVraag(1, "Hoevaak heeft het Nederlands Elftal de wereldbeker gewonnen?", new Keuzemogelijkheid[] {new Keuzemogelijkheid("A", "1"), new Keuzemogelijkheid("B", "2"), new Keuzemogelijkheid("C", "3"), new Keuzemogelijkheid("D", "0")}, new Antwoord("B"));

    public Vragenlijst(int nummer, String naam, Thema thema) {
        this.nummer = nummer;
        this.naam = naam;
        this.thema = thema;
        vragen = new ArrayList<>();
        vragen.add(vraag1);
        vragen.add(vraag2);
        vragen.add(vraag3);
        vragen.add(vraag4);
        vragen.add(vraag5);
        vragen.add(vraag6);
        vragen.add(vraag7);
        vragen.add(vraag8);
        vragen.add(vraag9);
        vragen.add(vraag10);
    }

    public String getNaam() {
        return naam;
    }

    public List<Vraag> getVragen() {
        return vragen;
    }

    public String getThema() {
        return thema.getNaam();
    }
    public int getLifetimeBest() {
        return lifetimeBest;
    }
    public void setLifetimeBest(int ltb) {
        lifetimeBest = ltb;
    }
    public int getNummer() {
        return nummer;
    }
}
