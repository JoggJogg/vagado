package nl.han.oose.ooad.vagado;

import java.util.List;

public class Puntentelling {

    private List<Score> scores;
    private int bonusPunten;
    private Berekening berekening;

    public int berekenPunten() {
        return berekening.berekenPunten(scores, bonusPunten);
    }

    public void setBerekening(Berekening berekening) {
        this.berekening = berekening;
    }

    public Berekening getBerekening() {
        return berekening;
    }

    public int getPuntenPerVraag() {
        return berekening.getPuntenPerVraag();
    }
}
