package nl.han.oose.ooad.vagado;

import nl.han.oose.ooad.vagado.vraag.Vraag;

import java.util.List;

public interface Berekening {

    int berekenPunten(List<Vraag> vragen, int bonusPunten);

    boolean alleVragenGoed(int puntenTotaal);

    int getPuntenPerVraag();
}
