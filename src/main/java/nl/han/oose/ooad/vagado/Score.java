package nl.han.oose.ooad.vagado;

public class Score {

    private Puntentelling puntentelling;
    private int uitgekeerdePunten;
    private int maximalePunten;

    public Score(Puntentelling puntentelling) {
        this.puntentelling = puntentelling;
        this.maximalePunten = puntentelling.getPuntenPerVraag();
    }
    public void updateScore(boolean vraagGoed) {
        if(vraagGoed) uitgekeerdePunten = maximalePunten;
        else uitgekeerdePunten = 0;
    }

    public int getScore() {
        return uitgekeerdePunten;
    }
}
