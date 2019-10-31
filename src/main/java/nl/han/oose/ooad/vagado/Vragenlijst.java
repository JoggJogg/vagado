package nl.han.oose.ooad.vagado;

import java.util.ArrayList;
import java.util.List;

public class Vragenlijst {

    private int nummer;
    private String onderwerp;
    private Thema thema;
    private List<Vraag> vragen;

    Vraag vraag1 = new MeerkeuzeVraag("Hoevaak heeft het Nederlands Elftal de wereldbeker gewonnen?", new Alternatief[] {new Alternatief("A", "1"), new Alternatief("B", "2"), new Alternatief("C", "3"), new Alternatief("D", "0")}, new Antwoord("D"));
    Vraag vraag2 = new MeerkeuzeVraag( "Hoeveel keuzemogelijkheden heeft deze vraag?", new Alternatief[] {new Alternatief("A", "1"), new Alternatief("B", "2"), new Alternatief("C", "3"), new Alternatief("D", "4")}, new Antwoord("D"));
    Vraag vraag3 = new MeerkeuzeVraag( "Hoeveel spelers staan er in het voetbalteam?", new Alternatief[] {new Alternatief("A", "8"), new Alternatief("B", "5"), new Alternatief("C", "11"), new Alternatief("D", "11")}, new Antwoord("C"));
    Vraag vraag4 = new MeerkeuzeVraag( "Wat betekent Snbrrttttt?", new Alternatief[] {new Alternatief("A", "Fiets"), new Alternatief("B", "Snowboard"), new Alternatief("C", "Step"), new Alternatief("D", "Auto")}, new Antwoord("B"));
    Vraag vraag5 = new MeerkeuzeVraag( "Welke van de volgende opties is geen bestaande pizza?", new Alternatief[] {new Alternatief("A", "Pizza Sneeuw"), new Alternatief("B", "Pizza Salami"), new Alternatief("C", "Pizza Hawaii"), new Alternatief("D", "Pizza Margharita")}, new Antwoord("A"));
    Vraag vraag6 = new MeerkeuzeVraag( "Wie is Henk?", new Alternatief[] {new Alternatief("A", "Jan"), new Alternatief("B", "Pieter"), new Alternatief("C", "Henk"), new Alternatief("D", "Ingrid")}, new Antwoord("C"));
    Vraag vraag7 = new MeerkeuzeVraag( "Is een ham eten?", new Alternatief[] {new Alternatief("A", "Ja"), new Alternatief("B", "Kaas"), new Alternatief("C", "Nee"), new Alternatief("D", "Misschien")}, new Antwoord("A"));

    Vraag vraag8 = new OpenVraag( "Waar staat de H in HAN voor?", new Antwoord[] {new Antwoord("hogeschool"), new Antwoord("hogeschool")});
    Vraag vraag9 = new OpenVraag( "Hoeveel milliliters zitten er in een liter?", new Antwoord[] {new Antwoord("1000"), new Antwoord("duizend")});
    Vraag vraag10 = new OpenVraag( "Wie was de eerste zwarte president van de V.S.?", new Antwoord[] {new Antwoord("obama"), new Antwoord("barrack obama")});
    Vraag vraag11 = new OpenVraag( "Wat is de maximaal toegestane snelheid binnen de bebouwde kom?", new Antwoord[] {new Antwoord("50"), new Antwoord("vijftig")});
    Vraag vraag12 = new OpenVraag( "Waar staat de afkorting OS voor binnen software ontwikkeling?", new Antwoord[] {new Antwoord("operating system"), new Antwoord("operation system")});
    Vraag vraag13 = new OpenVraag( "Uit welk land komt Huawei?", new Antwoord[] {new Antwoord("China")});
    Vraag vraag14 = new OpenVraag( "Waar wordt Huawei van verdacht?", new Antwoord[] {new Antwoord("Spionage"), new Antwoord("Spioneren")});


    public Vragenlijst(int nummer, String naam, Thema thema) {
        this.nummer = nummer;
        this.onderwerp = naam;
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
        vragen.add(vraag13);
        vragen.add(vraag14);
    }

    public String getOnderwerp() {
        return onderwerp;
    }

    public List<Vraag> getVragen() {
        return vragen;
    }

    public String getThema() {
        return thema.getNaam();
    }

    public int getNummer() {
        return nummer;
    }
}
