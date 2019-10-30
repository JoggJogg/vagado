package nl.han.oose.ooad.vagado.vraag;

import nl.han.oose.ooad.vagado.Score;

public abstract class Vraag {

    protected String vraag;
    private int vraagNummer;
    protected Score score;

    public Vraag(int vraagnummer, String vraag) {
        this.vraagNummer = vraagnummer;
        this.vraag = vraag;
        score = new Score();
    }

    public abstract void checkAntwoord(String gebruikerAntwoord);

    public abstract void toonVraag();

    public String getVraag() {
        return vraag;
    }

    public Score getScore() {
        return score;
    }

}
