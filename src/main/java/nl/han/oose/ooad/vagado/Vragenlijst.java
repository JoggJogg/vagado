package nl.han.oose.ooad.vagado;

import java.util.ArrayList;
import java.util.List;

public class Vragenlijst {

    private int nummer;
    private String onderwerp;
    private Thema thema;
    private List<Vraag> vragen;

    Vraag vraag1 = new MeerkeuzeVraag("Hoevaak heeft het Nederlands Elftal de wereldbeker gewonnen?", new Alternatief[] {new Alternatief("A", "1"), new Alternatief("B", "2"), new Alternatief("C", "3"), new Alternatief("D", "0")}, new Antwoord("B"));
    Vraag vraag2 = new MeerkeuzeVraag( "Ja?", new Alternatief[] {new Alternatief("A", "1"), new Alternatief("B", "2"), new Alternatief("C", "3"), new Alternatief("D", "0")}, new Antwoord("B"));
    Vraag vraag3 = new MeerkeuzeVraag( "Nee?", new Alternatief[] {new Alternatief("A", "1"), new Alternatief("B", "2"), new Alternatief("C", "3"), new Alternatief("D", "0")}, new Antwoord("B"));
    Vraag vraag4 = new MeerkeuzeVraag( "Snbrrttttt?", new Alternatief[] {new Alternatief("A", "1"), new Alternatief("B", "2"), new Alternatief("C", "3"), new Alternatief("D", "0")}, new Antwoord("B"));
    Vraag vraag5 = new MeerkeuzeVraag( "Pizza?", new Alternatief[] {new Alternatief("A", "1"), new Alternatief("B", "2"), new Alternatief("C", "3"), new Alternatief("D", "0")}, new Antwoord("B"));
    Vraag vraag6 = new MeerkeuzeVraag( "Wie is Henk?", new Alternatief[] {new Alternatief("A", "1"), new Alternatief("B", "2"), new Alternatief("C", "3"), new Alternatief("D", "0")}, new Antwoord("B"));
    Vraag vraag7 = new MeerkeuzeVraag( "Is een ham eten?", new Alternatief[] {new Alternatief("A", "1"), new Alternatief("B", "2"), new Alternatief("C", "3"), new Alternatief("D", "0")}, new Antwoord("B"));
    Vraag vraag8 = new MeerkeuzeVraag( "Waar?", new Alternatief[] {new Alternatief("A", "1"), new Alternatief("B", "2"), new Alternatief("C", "3"), new Alternatief("D", "0")}, new Antwoord("B"));
    Vraag vraag9 = new MeerkeuzeVraag( "Wat?", new Alternatief[] {new Alternatief("A", "1"), new Alternatief("B", "2"), new Alternatief("C", "3"), new Alternatief("D", "0")}, new Antwoord("B"));
    Vraag vraag10 = new MeerkeuzeVraag( "Hoeveel kaas eet een kip?", new Alternatief[] {new Alternatief("A", "1"), new Alternatief("B", "2"), new Alternatief("C", "3"), new Alternatief("D", "0")}, new Antwoord("B"));
    Vraag vraag11 = new MeerkeuzeVraag( "Dit is vraag 11?", new Alternatief[] {new Alternatief("A", "1"), new Alternatief("B", "2"), new Alternatief("C", "3"), new Alternatief("D", "0")}, new Antwoord("B"));
    Vraag vraag12 = new MeerkeuzeVraag( "Dit is vraag 12?", new Alternatief[] {new Alternatief("A", "1"), new Alternatief("B", "2"), new Alternatief("C", "3"), new Alternatief("D", "0")}, new Antwoord("B"));

    Vraag vraag13 = new OpenVraag( "Waar staat de H in HAN voor?", new Antwoord[] {new Antwoord("hogeschool"), new Antwoord("hogeschool")});
    Vraag vraag14 = new OpenVraag( "Hoeveel milliliters zitten er in een liter?", new Antwoord[] {new Antwoord("1000"), new Antwoord("duizend")});
    Vraag vraag15 = new OpenVraag( "Wie was de eerste zwarte president van de V.S.?", new Antwoord[] {new Antwoord("obama"), new Antwoord("barrack obama")});
    Vraag vraag16 = new OpenVraag( "Wat is de maximaal toegestane snelheid binnen de bebouwde kom?", new Antwoord[] {new Antwoord("50"), new Antwoord("vijftig")});
    Vraag vraag17 = new OpenVraag( "Waar staat de aftkorting OS voor binnen software ontwikkeling?", new Antwoord[] {new Antwoord("operating system")});

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
        vragen.add(vraag15);
        vragen.add(vraag16);
        vragen.add(vraag17);
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
