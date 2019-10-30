package nl.han.oose.ooad.vagado;

import nl.han.oose.ooad.vagado.vraag.Vraag;

import java.util.List;

public class BerekeningStandaard implements Berekening {

    private int puntenPerVraag = 1;

    @Override
    public int berekenPunten(List<Vraag> vragen, int bonusPunten) {
        int totaalScore = 0;
        for(Vraag vraag : vragen) {
            if(vraag.isGoedBeantwoord()) totaalScore += puntenPerVraag;
        }
        return totaalScore + bonusPunten;
    }

    public int getPuntenPerVraag() {
        return puntenPerVraag;
    }
}
