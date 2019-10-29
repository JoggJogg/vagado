package nl.han.oose.ooad.vagado;

import java.util.List;

public interface Berekening {

    int berekenPunten(List<Score> scores, int bonusPunten);

    int getPuntenPerVraag();
}
