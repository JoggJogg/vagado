package nl.han.oose.ooad.vagado.vraag;

import java.util.ArrayList;
import java.util.List;

public class OpenVraag extends Vraag {

    private Antwoord[] antwoorden;

    public OpenVraag(int vraagnummer, String vraag, Antwoord[] antwoorden) {
        super(vraagnummer, vraag);
        this.antwoorden = antwoorden;
    }

    @Override
    public void checkAntwoord(String userAntwoord) {
        userAntwoord = userAntwoord.toLowerCase();
        for(Antwoord antwoord: antwoorden) {
            score.setGoedBeantwoord(antwoord.checkAntwoord(userAntwoord));
            break;
        }
        if(score.isGoedBeantwoord()) System.out.println("GOED!");
        else System.out.println("FOUT");
    }

    @Override
    public void toonVraag() {
        System.out.println(super.getVraag());
    }
}
