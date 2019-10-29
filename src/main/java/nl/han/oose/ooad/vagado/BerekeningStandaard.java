package nl.han.oose.ooad.vagado;

import java.util.List;

public class BerekeningStandaard implements Berekening {

    private int puntenPerVraag;

    @Override
    public int berekenPunten(List<Score> scores, int bonusPunten) {
        return scores.stream().mapToInt( i -> i.getScore()).sum() + bonusPunten;
    }

    public int getPuntenPerVraag() {
        return puntenPerVraag;
    }
}
