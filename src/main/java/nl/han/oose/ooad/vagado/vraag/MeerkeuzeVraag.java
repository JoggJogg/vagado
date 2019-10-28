package nl.han.oose.ooad.vagado.vraag;

public class MeerkeuzeVraag extends Vraag {

    private Antwoord antwoord;

    @Override
    public boolean checkAntwoord(String gebruikerAntwoord) {
        return antwoord.checkAntwoord(gebruikerAntwoord);
    }
}
