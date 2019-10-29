package nl.han.oose.ooad.vagado.vraag;

import java.util.ArrayList;
import java.util.List;

public class OpenVraag extends Vraag {

    private List<Antwoord> antwoorden;

    public OpenVraag(int vraagnummer, String vraag, List<Antwoord> antwoorden) {
        super(vraagnummer, vraag);
        this.antwoorden = antwoorden;
    }

    @Override
    public boolean checkAntwoord(String userAntwoord) {
        for(Antwoord antwoord: antwoorden) {
            if(antwoord.checkAntwoord(userAntwoord)) return true;
        }
        return false;
    }

    @Override
    public void toonVraag() {
        System.out.println(super.getVraag());
    }
}
