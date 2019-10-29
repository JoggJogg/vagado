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
    Vraag vraag2 = new MeerkeuzeVraag(2, "Ja?", new Keuzemogelijkheid[] {new Keuzemogelijkheid("A", "1"), new Keuzemogelijkheid("B", "2"), new Keuzemogelijkheid("C", "3"), new Keuzemogelijkheid("D", "0")}, new Antwoord("B"));
    Vraag vraag3 = new MeerkeuzeVraag(3, "Nee?", new Keuzemogelijkheid[] {new Keuzemogelijkheid("A", "1"), new Keuzemogelijkheid("B", "2"), new Keuzemogelijkheid("C", "3"), new Keuzemogelijkheid("D", "0")}, new Antwoord("B"));
    Vraag vraag4 = new MeerkeuzeVraag(4, "Snbrrttttt?", new Keuzemogelijkheid[] {new Keuzemogelijkheid("A", "1"), new Keuzemogelijkheid("B", "2"), new Keuzemogelijkheid("C", "3"), new Keuzemogelijkheid("D", "0")}, new Antwoord("B"));
    Vraag vraag5 = new MeerkeuzeVraag(5, "Pizza?", new Keuzemogelijkheid[] {new Keuzemogelijkheid("A", "1"), new Keuzemogelijkheid("B", "2"), new Keuzemogelijkheid("C", "3"), new Keuzemogelijkheid("D", "0")}, new Antwoord("B"));
    Vraag vraag6 = new MeerkeuzeVraag(6, "Wie is Henk?", new Keuzemogelijkheid[] {new Keuzemogelijkheid("A", "1"), new Keuzemogelijkheid("B", "2"), new Keuzemogelijkheid("C", "3"), new Keuzemogelijkheid("D", "0")}, new Antwoord("B"));
    Vraag vraag7 = new MeerkeuzeVraag(7, "Is een ham eten?", new Keuzemogelijkheid[] {new Keuzemogelijkheid("A", "1"), new Keuzemogelijkheid("B", "2"), new Keuzemogelijkheid("C", "3"), new Keuzemogelijkheid("D", "0")}, new Antwoord("B"));
    Vraag vraag8 = new MeerkeuzeVraag(8, "Waar?", new Keuzemogelijkheid[] {new Keuzemogelijkheid("A", "1"), new Keuzemogelijkheid("B", "2"), new Keuzemogelijkheid("C", "3"), new Keuzemogelijkheid("D", "0")}, new Antwoord("B"));
    Vraag vraag9 = new MeerkeuzeVraag(9, "Wat?", new Keuzemogelijkheid[] {new Keuzemogelijkheid("A", "1"), new Keuzemogelijkheid("B", "2"), new Keuzemogelijkheid("C", "3"), new Keuzemogelijkheid("D", "0")}, new Antwoord("B"));
    Vraag vraag10 = new MeerkeuzeVraag(10, "Hoeveel kaas eet een kip?", new Keuzemogelijkheid[] {new Keuzemogelijkheid("A", "1"), new Keuzemogelijkheid("B", "2"), new Keuzemogelijkheid("C", "3"), new Keuzemogelijkheid("D", "0")}, new Antwoord("B"));
    Vraag vraag11 = new MeerkeuzeVraag(11, "Dit is vraag 11?", new Keuzemogelijkheid[] {new Keuzemogelijkheid("A", "1"), new Keuzemogelijkheid("B", "2"), new Keuzemogelijkheid("C", "3"), new Keuzemogelijkheid("D", "0")}, new Antwoord("B"));
    Vraag vraag12 = new MeerkeuzeVraag(12, "Dit is vraag 12?", new Keuzemogelijkheid[] {new Keuzemogelijkheid("A", "1"), new Keuzemogelijkheid("B", "2"), new Keuzemogelijkheid("C", "3"), new Keuzemogelijkheid("D", "0")}, new Antwoord("B"));

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
        vragen.add(vraag11);
        vragen.add(vraag12);
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
