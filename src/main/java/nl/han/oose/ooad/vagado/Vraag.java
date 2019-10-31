package nl.han.oose.ooad.vagado;

public abstract class Vraag {

    protected String vraag;
    protected Punten punten;

    public Vraag(String vraag) {
        this.vraag = vraag;
        punten = new Punten();
    }

    public abstract void checkAntwoord(String gebruikerAntwoord);

    public abstract void toonVraag();

    public String getVraag() {
        return vraag;
    }

    public Punten getPunten() {
        return punten;
    }

}
