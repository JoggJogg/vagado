package nl.han.oose.ooad.vagado.vraag;

public abstract class Vraag {

    protected String vraag;
    private int vraagNummer;
    protected boolean goedBeantwoord;

    public Vraag(int vraagnummer, String vraag) {
        this.vraagNummer = vraagnummer;
        this.vraag = vraag;
    }

    public abstract void checkAntwoord(String gebruikerAntwoord);

    public abstract void toonVraag();

    public String getVraag() {
        return vraag;
    }

    public boolean isGoedBeantwoord() {
        return goedBeantwoord;
    }

}
