package nl.han.oose.ooad.vagado.vraag;

import java.util.List;

public class OpenVraag extends Vraag {

    private List<Antwoord> antwoorden;

    @Override
    public boolean checkAntwoord(String userAntwoord) {
        for(Antwoord antwoord: antwoorden) {
            if(!antwoord.checkAntwoord(userAntwoord)) return false;
        }
        return true;
    }
}
