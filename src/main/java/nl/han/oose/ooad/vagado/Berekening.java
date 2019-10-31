package nl.han.oose.ooad.vagado;

import java.util.List;

public interface Berekening {

    int berekenPunten(List<Vraag> vragen, int bonusPunten);

    boolean alleVragenGoed(int puntenTotaal);

    int getPuntenPerVraag();

    int verhoogPuntenTotaal(int totaal, int verhoging);
}
