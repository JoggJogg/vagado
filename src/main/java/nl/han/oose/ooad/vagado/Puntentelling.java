package nl.han.oose.ooad.vagado;

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

    public boolean alleVragenGoed(int puntenTotaal) {
        return berekening.alleVragenGoed(puntenTotaal);
    }
}
