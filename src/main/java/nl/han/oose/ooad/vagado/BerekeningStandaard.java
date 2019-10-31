package nl.han.oose.ooad.vagado;

import java.util.List;

public class BerekeningStandaard implements Berekening {

    private int puntenPerVraag = 1;

    @Override
    public int berekenPunten(List<Vraag> vragen, int bonusPunten) {
        int totaalScore = 0;
        for(Vraag vraag : vragen) {
            if(vraag.getPunten().isGoedBeantwoord()) totaalScore = verhoogPuntenTotaal(totaalScore, puntenPerVraag);
        }
        return totaalScore + bonusPunten;
    }

    @Override
    public boolean alleVragenGoed(int puntenTotaal) {
        return puntenTotaal/10 == puntenPerVraag;
    }

    @Override
    public int verhoogPuntenTotaal(int totaal, int verhoging) {
        return totaal + verhoging;
    }

    @Override
    public int getPuntenPerVraag() {
        return puntenPerVraag;
    }
}
