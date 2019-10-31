package nl.han.oose.ooad.vagado;

public class Antwoord {

    private String antwoord;

    public Antwoord(String antwoord) {
        this.antwoord = antwoord;
    }

    public boolean checkAntwoord(String gebruikerAntwoord) {
        return antwoord.equals(gebruikerAntwoord);
    }
}
