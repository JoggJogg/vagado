package nl.han.oose.ooad.vagado;

import nl.han.oose.ooad.vagado.vraag.Vraag;

import java.util.List;

public class Puntentelling {

    private int bonusPunten;
    private Berekening berekening;

    public int berekenPunten(List<Vraag> vragen) {
        return berekening.berekenPunten(vragen, bonusPunten);
    }

    public void setBerekening(Berekening berekening) {
        this.berekening = berekening;
    }
}
