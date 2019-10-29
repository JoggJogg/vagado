package nl.han.oose.ooad.vagado.vraag;

import nl.han.oose.ooad.vagado.Score;

public abstract class Vraag {

    private String vraag;
    private int vraagNummer;
    private Score score;

    public Vraag(int vraagnummer, String vraag) {
        this.vraagNummer = vraagnummer;
        this.vraag = vraag;
    }

    public abstract boolean checkAntwoord(String gebruikerAntwoord);

    public abstract void toonVraag();

    public String getVraag() {
        return vraag;
    }
}
