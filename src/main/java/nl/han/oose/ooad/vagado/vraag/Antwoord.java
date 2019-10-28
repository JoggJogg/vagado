package nl.han.oose.ooad.vagado.vraag;

public class Antwoord {

    private String antwoord;

    public boolean checkAntwoord(String gebruikerAntwoord) {
        return antwoord.equals(gebruikerAntwoord);
    }
}
